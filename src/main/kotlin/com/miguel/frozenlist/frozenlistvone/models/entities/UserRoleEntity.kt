package com.miguel.frozenlist.frozenlistvone.models.entities

import com.miguel.frozenlist.frozenlistvone.models.UserRole
import javax.persistence.*

@Entity
class UserRoleEntity(@Column(nullable = false) var role: UserRole) {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private var id: Long? = null

    @OneToMany
    private lateinit var users: List<UserEntity>


}
