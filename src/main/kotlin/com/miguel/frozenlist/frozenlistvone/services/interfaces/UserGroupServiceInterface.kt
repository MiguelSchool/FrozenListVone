package com.miguel.frozenlist.frozenlistvone.services.interfaces

import com.miguel.frozenlist.frozenlistvone.dtos.UserGroupDto
import org.springframework.http.ResponseEntity

interface UserGroupServiceInterface {
    fun userGroupFindByDto(userGroupDto: UserGroupDto?): ResponseEntity<UserGroupDto>
    fun userGroupFindById(userGroup: Long?) : ResponseEntity<UserGroupDto>
    fun userGroupFindByAddress(addressDto: UserGroupDto?) : ResponseEntity<List<UserGroupDto>>
    fun createUserGroup(userGroupDto: UserGroupDto?) : ResponseEntity<UserGroupDto>
    fun deleteUserGroup(userGroupDto: UserGroupDto?) : Void
    fun countUsersInUserGroup(userGroupDto: UserGroupDto?): ResponseEntity<Int>

}
