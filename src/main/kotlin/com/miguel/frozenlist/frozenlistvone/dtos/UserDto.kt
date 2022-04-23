package com.miguel.frozenlist.frozenlistvone.dtos

import lombok.*
import java.io.Serializable

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
class UserDto: Serializable {
    val id: Long? = null
    val email: String? = null
    val password: String? = null
    val firstname: String? = null
    val lastname: String? = null
    val dayOfBirth: String? = null
    val userGroupEntity: UserGroupDto? = null
    val recipeEntity: MutableList<RecipeDto> = mutableListOf()
    val userRoleEntity: UserRoleDto? = null
    var isValid: Boolean = false
}
