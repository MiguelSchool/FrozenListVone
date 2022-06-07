package com.miguel.frozenlist.frozenlistvone.dtos.globalMapperFiles

import com.miguel.frozenlist.frozenlistvone.dtos.UserGroupDto
import com.miguel.frozenlist.frozenlistvone.models.entities.UserGroupEntity


internal val userGroupDtoToEntity: (UserGroupDto) -> UserGroupEntity = {
    val userGroupEntity = UserGroupEntity()
    userGroupEntity.userGroupName = it.name
    //userGroupEntity.users = userGroupDto.users
    userGroupEntity
}

internal val userGroupEntityToDto: (UserGroupEntity) -> UserGroupDto = {
    val userGroupDto = UserGroupDto()
    userGroupDto.name = it.userGroupName
    userGroupDto.address =  addressEntityToDto(it.address)
    //userGroupDto.storages =  storageEntityListToDto(it.storages)
    userGroupDto
}




