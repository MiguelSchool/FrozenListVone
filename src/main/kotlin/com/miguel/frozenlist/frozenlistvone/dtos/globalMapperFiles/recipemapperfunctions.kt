package com.miguel.frozenlist.frozenlistvone.dtos.globalMapperFiles

import com.miguel.frozenlist.frozenlistvone.dtos.RecipeDto
import com.miguel.frozenlist.frozenlistvone.models.entities.RecipeEntity

internal val recipeEntityToDto : (RecipeEntity) -> RecipeDto = {
    val recipeDto = RecipeDto()
        recipeDto.name = it.recipeName ?: ""
        recipeDto.description = it.description ?: ""
        recipeDto.isPrivateRecipe = it.isPrivateRecipe ?: false
        recipeDto.isFavorite = it.isFavorite
        recipeDto.category = it.category ?: ""
        recipeDto.cookedCount = it.cookedCount ?: 0
        recipeDto.duration = it.duration ?: 0.0
        recipeDto.image = it.image ?: ""
//TODO: MAPPING
    recipeDto
}

internal  val recipeDtoToEntity : (RecipeDto) -> RecipeEntity = {
    val recipeEntity = RecipeEntity()
    //TODO: MAPPING
    recipeEntity
}
