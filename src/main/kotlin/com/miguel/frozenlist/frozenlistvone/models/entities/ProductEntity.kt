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
    private final val productName: String? = null

    @Column(nullable = false)
    private final val durabilityDays: Int? = null

    @Column(nullable = false)
    private final val boughtAt: LocalDate? = null

    @Column(nullable = false)
    private final val image : String? = null

    @ManyToOne
    @JoinColumn(name = "storage_id", nullable = false, unique = true)
    private lateinit var storageEntity: StorageEntity

    @ManyToOne
    private lateinit var brandEntity: BrandEntity

    @ManyToMany
    private lateinit var shoppingListEntities: List<ShoppingListEntity>
}
