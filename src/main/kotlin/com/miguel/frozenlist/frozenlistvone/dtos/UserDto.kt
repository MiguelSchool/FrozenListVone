package com.miguel.frozenlist.frozenlistvone.dtos

import java.io.Serializable

data class UserDto(
    val email: String? = null,
    val password: String? = null,
    val firstname: String? = null,
    val lastname: String? = null,
    val dayOfBirth: String? = null,
    val userGroupEntity: UserGroupDto? = null,
    val recipeEntity: MutableList<RecipeDto> = mutableListOf(),
    val userRoleEntity: UserRoleDto? = null
) : Serializable
