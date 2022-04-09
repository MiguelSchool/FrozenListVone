package com.miguel.frozenlist.frozenlistvone.models.entities

import javax.persistence.*

@Entity
class StorageTypeEntity(@Column(nullable = false)var name: String) {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private var id: Long? = null

    @OneToMany
    private lateinit var storageEntity: List<StorageEntity>

}
