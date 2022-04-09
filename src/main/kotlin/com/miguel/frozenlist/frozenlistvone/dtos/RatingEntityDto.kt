package com.miguel.frozenlist.frozenlistvone.dtos

import com.miguel.frozenlist.frozenlistvone.models.Rating
import java.io.Serializable

data class RatingEntityDto(val rating: Rating? = null, val recipeEntities: MutableList<RecipeDto> = mutableListOf()) :
    Serializable
