package com.miguel.frozenlist.frozenlistvone.models.entities

import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import javax.persistence.*

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Ingredients")
class IngredientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    var id: Long? = null

    @Column(nullable = false)
    var ingredientName: String? = null

    @Column(nullable = false)
    var amount: Double? = null

    @Column(nullable = false)
    var ingredientGroup: String? = null

    @ManyToMany
    lateinit var recipeEntities: List<RecipeEntity>

}
