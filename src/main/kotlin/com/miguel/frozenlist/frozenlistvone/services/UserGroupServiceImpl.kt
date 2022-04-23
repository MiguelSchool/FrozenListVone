package com.miguel.frozenlist.frozenlistvone.services

import com.miguel.frozenlist.frozenlistvone.dtos.AddressDto
import com.miguel.frozenlist.frozenlistvone.dtos.UserGroupDto
import com.miguel.frozenlist.frozenlistvone.dtos.globalMapperFiles.addressDtoToEntity
import com.miguel.frozenlist.frozenlistvone.dtos.globalMapperFiles.userGroupDtoToEntity
import com.miguel.frozenlist.frozenlistvone.dtos.globalMapperFiles.userGroupEntityToDto
import com.miguel.frozenlist.frozenlistvone.exceptions.AddressNotFoundException
import com.miguel.frozenlist.frozenlistvone.exceptions.BodyIsEmptyException
import com.miguel.frozenlist.frozenlistvone.exceptions.UserGroupNotFoundException
import com.miguel.frozenlist.frozenlistvone.models.entities.UserGroupEntity
import com.miguel.frozenlist.frozenlistvone.repositories.AddressRepository
import com.miguel.frozenlist.frozenlistvone.repositories.UserGroupRepository
import com.miguel.frozenlist.frozenlistvone.services.interfaces.UserGroupServiceInterface
import org.springframework.http.ResponseEntity
import org.springframework.web.servlet.support.ServletUriComponentsBuilder
import java.nio.file.attribute.UserPrincipalNotFoundException

//@Service
class UserGroupServiceImpl(
    private val userGroupRepository: UserGroupRepository): UserGroupServiceInterface {

    override fun userGroupFindById(userGroup: Long?): ResponseEntity<UserGroupDto> {
           return ResponseEntity.ok(
               userGroupEntityToDto(userGroupRepository.findById(userGroup!!)
                   .orElseThrow{UserGroupNotFoundException("user group not found!")}))
    }

    override fun userGroupFindByAddress(addressDto: AddressDto?): ResponseEntity<List<UserGroupDto>> {
        val userGroupDtoList = mutableListOf<UserGroupDto>()
        val addressEntity = addressDtoToEntity(addressDto!!)
        return try {
            userGroupRepository.findAll()
                .filter { it.address == addressEntity }
                .map { userGroupDtoList.add(userGroupEntityToDto(it)) }
            ResponseEntity.ok(userGroupDtoList)
        }catch (e : Exception) {
            throw AddressNotFoundException("Address not found!")
        }
    }
    override fun createUserGroup(userGroupDto: UserGroupDto?): ResponseEntity<UserGroupDto> {
        if ( userGroupDto == null ) {
            throw BodyIsEmptyException("user group is empty")
        }
        val entity = userGroupDtoToEntity(userGroupDto)

        if(userGroupDto.address == null){
            addressDtoToEntity(AddressDto())
        }
        else {
            addressDtoToEntity(userGroupDto.address!!)
        }

        val userGroupEntityExist = userGroupRepository.existsById(entity.id!!)
        val dbResult = userGroupRepository.save(entity)
        return if(!userGroupEntityExist){
            val uri = ServletUriComponentsBuilder.fromCurrentRequest()
                                                 .build()
                                                 .toUri()
            ResponseEntity.created(uri)
                          .build()

        }else {
            ResponseEntity.ok(userGroupEntityToDto(dbResult))
        }

    }

    override fun deleteUserGroup(userGroupDto: UserGroupDto?) {
        return userGroupRepository.delete(userGroupDtoToEntity(userGroupDto!!))
    }

    override fun countUsersInUserGroup(userGroupDto: UserGroupDto?): ResponseEntity<Int> {
        return ResponseEntity.ok(userGroupRepository.findAll()
                                                    .count())
    }
}
