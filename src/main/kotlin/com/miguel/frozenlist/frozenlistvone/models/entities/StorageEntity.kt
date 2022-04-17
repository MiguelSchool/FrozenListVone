package com.miguel.frozenlist.frozenlistvone.models.entities

import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import javax.persistence.*

@Entity
@Getter
@Setter
@NoArgsConstructor

@Table(name = "Storages")
class StorageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    var id: Long? = null

    @Column(nullable = false)
    private var name : String? = null

    @Column(nullable = true)
    private var description : String? = null

    @OneToMany
    private lateinit var productEntity: List<ProductEntity>

    @ManyToOne
    private lateinit var storageTypeEntity: StorageTypeEntity

    @ManyToOne
    private lateinit var userGroupEntity: UserGroupEntity
}
