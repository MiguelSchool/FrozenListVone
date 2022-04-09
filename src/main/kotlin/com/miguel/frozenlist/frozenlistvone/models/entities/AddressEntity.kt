package com.miguel.frozenlist.frozenlistvone.models.entities

import javax.persistence.*

@Entity
class AddressEntity(
    var street : String,
    var streetNumber : String,
    var postcode : String,
    @Column(nullable = false) var City : String,
    @Column(nullable = false) var floor : String
) {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private var id: Long? = null

    @OneToMany

    private lateinit var userGroupEntity: List<UserGroupEntity>

}
