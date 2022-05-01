package com.miguel.frozenlist.frozenlistvone.dtos

import com.miguel.frozenlist.frozenlistvone.models.UserRole
import lombok.*
import java.io.Serializable


@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
class UserRoleDto : Serializable {
    val id: Long? = null
    val role: UserRole? = null
    var unlocked: Boolean = true
}
