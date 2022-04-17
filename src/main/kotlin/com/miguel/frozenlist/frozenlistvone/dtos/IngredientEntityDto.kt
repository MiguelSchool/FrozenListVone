package com.miguel.frozenlist.frozenlistvone.dtos

import com.miguel.frozenlist.frozenlistvone.dtos.RecipeDto
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
    val group: String? = null
    val recipeEntity: MutableList<RecipeDto> =  mutableListOf()
}
