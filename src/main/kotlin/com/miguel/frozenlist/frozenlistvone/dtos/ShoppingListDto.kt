package com.miguel.frozenlist.frozenlistvone.dtos

import lombok.*
import java.io.Serializable
import java.time.LocalDate


@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
class ShoppingListDto : Serializable {
    val id: Long? = null
    val createdAt: LocalDate? = null
    val name: String? = null
    val closed: Boolean? = null
    val totalPrice: Double? = null
}
