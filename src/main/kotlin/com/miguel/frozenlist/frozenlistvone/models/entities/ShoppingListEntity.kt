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
@Table(name = "Shoppinglists")
class ShoppingListEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    var id: Long? = null

    @Column(nullable = false)
    var createdAt: LocalDate? = null

    @Column( nullable = false)
    var shoppingListName: String? = null

    @Column( nullable = false) private var finish: Boolean? = null
    var totalPrice: Double? = null

    @ManyToMany
    lateinit var productEntities : List<ProductEntity>

    @ManyToOne
    lateinit var userGroupEntity: UserGroupEntity

}
