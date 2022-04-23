package com.miguel.frozenlist.frozenlistvone.dtos

import lombok.*
import java.io.Serializable

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
class IngredientEntityDto: Serializable {
    val name: String? = null
    val amount: Double? = null
    val ingredientGroup: String? = null
    val recipeEntity: MutableList<RecipeDto> =  mutableListOf()
}
