package com.miguel.frozenlist.frozenlistvone.dtos.globalMapperFiles

import com.miguel.frozenlist.frozenlistvone.dtos.UserGroupDto
import com.miguel.frozenlist.frozenlistvone.models.entities.UserGroupEntity


internal val userGroupDtoToEntity: (UserGroupDto) -> UserGroupEntity = { userGroupDto: UserGroupDto ->
    val userGroupEntity = UserGroupEntity()
    userGroupEntity.userGroupName = userGroupDto.name

    userGroupEntity
}

internal val userGroupEntityToDto: (UserGroupEntity) -> UserGroupDto = { userGroupEntity: UserGroupEntity ->
    val userGroupDto = UserGroupDto()
    userGroupDto.name = userGroupEntity.userGroupName
    userGroupDto.address =  addressEntityToDto(userGroupEntity.address)
    userGroupDto.address
    userGroupDto
}






