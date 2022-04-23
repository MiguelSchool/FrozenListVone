package com.miguel.frozenlist.frozenlistvone.services

import com.miguel.frozenlist.frozenlistvone.dtos.UserGroupDto
import com.miguel.frozenlist.frozenlistvone.dtos.globalMapperFiles.userGroupDtoToEntity
import com.miguel.frozenlist.frozenlistvone.dtos.globalMapperFiles.userGroupEntityToDto
import com.miguel.frozenlist.frozenlistvone.exceptions.BodyIsEmptyException
import com.miguel.frozenlist.frozenlistvone.repositories.UserGroupRepository
import com.miguel.frozenlist.frozenlistvone.services.interfaces.UserGroupServiceInterface
import org.springframework.http.ResponseEntity
import org.springframework.web.servlet.support.ServletUriComponentsBuilder

//@Service
class UserGroupServiceImpl(
    private val userGroupRepository: UserGroupRepository): UserGroupServiceInterface {

    override fun userGroupFindByDto(userGroupDto: UserGroupDto?): ResponseEntity<UserGroupDto> {
        TODO("Not yet implemented")
    }

    override fun userGroupFindById(userGroup: Long?): ResponseEntity<UserGroupDto> {
        TODO("Not yet implemented")
    }

    override fun userGroupFindByAddress(addressDto: UserGroupDto?): ResponseEntity<List<UserGroupDto>> {
        TODO("Not yet implemented")
    }


    override fun createUserGroup(userGroupDto: UserGroupDto?): ResponseEntity<UserGroupDto> {
        if (userGroupDto == null) {
            throw BodyIsEmptyException("user group is empty")
        }
        val entity = userGroupDtoToEntity(userGroupDto)

        if(userGroupDto.address != null){

        }

        val dbResult = userGroupRepository.saveOrUpdate(entity)
        return if(dbResult.first){
            val uri = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri()
            ResponseEntity.created(uri).build()

        }else {
            ResponseEntity.ok(userGroupEntityToDto(dbResult.second))
        }

    }

    override fun deleteUserGroup(userGroupDto: UserGroupDto?): Void {
        TODO("Not yet implemented")
    }

    override fun countUsersInUserGroup(userGroupDto: UserGroupDto?): ResponseEntity<Int> {
        TODO("Not yet implemented")
    }
}
