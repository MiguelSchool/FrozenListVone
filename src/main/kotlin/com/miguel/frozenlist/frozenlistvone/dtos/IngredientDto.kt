package com.miguel.frozenlist.frozenlistvone.dtos

import lombok.*
import java.io.Serializable

@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
class IngredientDto: Serializable {
    val id: Long? = null
    val name: String? = null
    val amount: Double? = null
    val ingredientGroup: String? = null
    val recipeEntity: MutableList<RecipeDto> =  mutableListOf()
}
