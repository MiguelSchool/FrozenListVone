package com.miguel.frozenlist.frozenlistvone.dtos

import lombok.*
import java.io.Serializable
import java.time.LocalDate

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
class ShoppingListDto : Serializable {
    val createdAt: LocalDate? = null
    val name: String? = null
    val closed: Boolean? = null
    val totalPrice: Double? = null
}
