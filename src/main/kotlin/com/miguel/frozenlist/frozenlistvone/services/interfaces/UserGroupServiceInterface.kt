package com.miguel.frozenlist.frozenlistvone.services.interfaces

import com.miguel.frozenlist.frozenlistvone.dtos.AddressDto
import com.miguel.frozenlist.frozenlistvone.dtos.UserGroupDto
import org.springframework.http.ResponseEntity

interface UserGroupServiceInterface {

    fun userGroupFindById(userGroup: Long?) : ResponseEntity<UserGroupDto>
    fun userGroupFindByAddress(addressDto: AddressDto?) : ResponseEntity<List<UserGroupDto>>
    fun createUserGroup(userGroupDto: UserGroupDto?) : ResponseEntity<UserGroupDto>
    fun deleteUserGroup(userGroupDto: UserGroupDto?)
    fun countUsersInUserGroup(userGroupDto: UserGroupDto?): ResponseEntity<Int>

}
