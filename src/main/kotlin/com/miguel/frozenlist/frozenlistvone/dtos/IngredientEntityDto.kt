package com.miguel.frozenlist.frozenlistvone.dtos

import com.miguel.frozenlist.frozenlistvone.dtos.RecipeDto
import java.io.Serializable

data class IngredientEntityDto(
    val name: String? = null,
    val amount: Double? = null,
    val group: String? = null,
    val recipeEntity: MutableList<RecipeDto> =  mutableListOf()
) : Serializable
