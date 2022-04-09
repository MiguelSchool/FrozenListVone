package com.miguel.frozenlist.frozenlistvone.models.entities

import javax.persistence.*

@Entity
class BrandEntity(
    @Column(nullable = false) var name: String,
    @Column(nullable = false) var price: Double) {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private var id: Long? = null

}
