package com.miguel.frozenlist.frozenlistvone.models.entities

import javax.persistence.*

@Entity
class IngredientEntity(
    @Column(nullable = false)private var name: String,
    @Column()private var amount: Double,
    @Column()private var group: String
) {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private var id: Long? = null

    @ManyToMany
    private lateinit var recipeEntity: List<RecipeEntity>

}
