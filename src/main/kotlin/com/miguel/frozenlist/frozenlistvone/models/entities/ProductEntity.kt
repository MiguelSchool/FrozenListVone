package com.miguel.frozenlist.frozenlistvone.models.entities

import lombok.ToString
import java.time.LocalDate
import javax.persistence.*

@Entity
@ToString
class ProductEntity(
    @Column(nullable = false) private final val name: String,
    @Column(nullable = false) private final val durabilityDays: Int,
    @Column(nullable = false) private final val boughtAt: LocalDate,
    @Column(nullable = false) private final val image : String ) {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private var id: Long? = null

    @ManyToOne
    private lateinit var storageEntity: StorageEntity

    @ManyToOne
    private lateinit var brandEntity: BrandEntity

    @ManyToMany
    private lateinit var shoppingListEntities: List<ShoppingListEntity>
}
