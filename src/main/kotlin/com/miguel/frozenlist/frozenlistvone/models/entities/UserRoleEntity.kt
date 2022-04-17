package com.miguel.frozenlist.frozenlistvone.models.entities

import com.miguel.frozenlist.frozenlistvone.models.UserRole
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import javax.persistence.*

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "UserRoles")
class UserRoleEntity {
    @Id
    @Column(nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null

    @Column(nullable = false)
    private var role: UserRole? = null

    @OneToMany
    private lateinit var users: Set<UserEntity>


}
