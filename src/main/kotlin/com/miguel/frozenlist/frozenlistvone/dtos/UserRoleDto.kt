package com.miguel.frozenlist.frozenlistvone.dtos

import com.miguel.frozenlist.frozenlistvone.models.UserRole
import lombok.*
import java.io.Serializable

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
class UserRoleDto : Serializable {
    val role: UserRole? = null
    val id: Long? = null
    var unlocked: Boolean = true
}
