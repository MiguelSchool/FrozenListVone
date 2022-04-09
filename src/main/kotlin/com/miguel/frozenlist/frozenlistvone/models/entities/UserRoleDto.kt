package com.miguel.frozenlist.frozenlistvone.models.entities

import com.miguel.frozenlist.frozenlistvone.dtos.UserDto
import com.miguel.frozenlist.frozenlistvone.models.UserRole
import java.io.Serializable

data class UserRoleDto(val role: UserRole? = null, val id: Long? = null, val users: MutableList<UserDto>? = null) :
    Serializable
