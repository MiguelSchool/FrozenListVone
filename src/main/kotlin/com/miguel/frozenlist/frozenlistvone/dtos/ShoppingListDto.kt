package com.miguel.frozenlist.frozenlistvone.dtos

import java.io.Serializable
import java.time.LocalDate

data class ShoppingListDto(
    val createdAt: LocalDate? = null,
    val name: String? = null,
    val closed: Boolean? = null,
    val totalPrice: Double? = null
) : Serializable
