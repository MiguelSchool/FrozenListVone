package com.miguel.frozenlist.frozenlistvone.dtos

import java.io.Serializable

data class UserGroupDto(
    val id: Long? = null,
    val name: String? = null,
    val address: AddressDto? = null,
    val storageEntity: MutableList<StorageDto> = mutableListOf(),
    val recipes: MutableList<RecipeDto?> = mutableListOf(),
    val favoritesRecipes: MutableList<RecipeDto> = mutableListOf(),
    val shoppingListEntities: MutableList<ShoppingListDto?> = mutableListOf()
) : Serializable
