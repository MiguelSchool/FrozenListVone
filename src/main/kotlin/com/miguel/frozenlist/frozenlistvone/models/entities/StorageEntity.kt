package com.miguel.frozenlist.frozenlistvone.models.entities

import lombok.EqualsAndHashCode
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import javax.persistence.*

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "Storages")
class StorageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    var id: Long? = null

    @Column(nullable = false)
    var storageName : String? = null

    @Column(nullable = true)
    var description : String? = null

    @OneToMany
    lateinit var productEntityList: List<ProductEntity>

    @ManyToOne
    lateinit var storageTypeEntity: StorageTypeEntity

    @ManyToOne
    lateinit var userGroupEntity: UserGroupEntity
}
