package com.miguel.frozenlist.frozenlistvone.dtos

import com.miguel.frozenlist.frozenlistvone.models.UserRole
import java.io.Serializable

data class UserRoleDto(val role: UserRole? = null, val id: Long? = null) : Serializable
