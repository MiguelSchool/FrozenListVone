package com.miguel.frozenlist.frozenlistvone.dtos

import java.io.Serializable
import java.time.LocalDate

data class ProductEntityDto(
    val name: String? = null,
    val durabilityDays: Int? = null,
    val boughtAt: LocalDate? = null,
    val image: String? = null,
    val storageEntity: StorageDto? = null,
    val brandEntity: BrandDto? = null,
    val shoppingListEntities: MutableList<ShoppingListDto> = mutableListOf()
) : Serializable
