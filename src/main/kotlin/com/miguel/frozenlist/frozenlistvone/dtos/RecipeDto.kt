package com.miguel.frozenlist.frozenlistvone.dtos

import java.io.Serializable

data class RecipeDto(
    val isPrivateRecipe: Boolean? = null,
    val duration: Double? = null,
    val name: String? = null,
    val cookedCount: Double? = null,
    val category: String? = null,
    val description: String? = null,
    val image: String? = null,
) : Serializable
