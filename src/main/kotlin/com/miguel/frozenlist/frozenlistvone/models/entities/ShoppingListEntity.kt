package com.miguel.frozenlist.frozenlistvone.models.entities

import java.time.LocalDate
import javax.persistence.*

@Entity
class ShoppingListEntity(
    @Column(nullable = false) private var createdAt: LocalDate,
    @Column( nullable = false) private var name: String,
    @Column( nullable = false) private var closed: Boolean,
    private var totalPrice: Double ) {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private var id: Long? = null

    @ManyToMany
    private lateinit var productEntities : List<ProductEntity>

    @ManyToOne
    private lateinit var userGroupEntity: UserGroupEntity

}
