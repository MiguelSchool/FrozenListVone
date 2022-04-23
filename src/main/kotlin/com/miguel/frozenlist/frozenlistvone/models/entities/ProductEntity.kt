package com.miguel.frozenlist.frozenlistvone.models.entities

import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import java.time.LocalDate
import javax.persistence.*

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Products")
class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    var id: Long? = null

    @Column(nullable = false)
    val productName: String? = null

    @Column(nullable = false)
    val durabilityDays: Int? = null

    @Column(nullable = false)
    val boughtAt: LocalDate? = null

    @Column(nullable = false)
    val image : String? = null

    @ManyToOne
    @JoinColumn(name = "storage_id", nullable = false, unique = true)
    lateinit var storageEntity: StorageEntity

    @ManyToOne
    lateinit var brandEntity: BrandEntity

    @ManyToMany
    lateinit var shoppingListEntities: List<ShoppingListEntity>
}
