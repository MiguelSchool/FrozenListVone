package com.miguel.frozenlist.frozenlistvone.models.entities

import javax.persistence.*

@Entity
class StorageEntity(
    @Column(nullable = false)private var name : String,
    @Column(nullable = true)private var description : String ) {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private var id: Long? = null

    @ManyToOne
    private lateinit var storageTypeEntity: StorageTypeEntity

    @ManyToOne
    private lateinit var userGroupEntity: UserGroupEntity

    @OneToMany
    private lateinit var productEntity: List<ProductEntity>
}
