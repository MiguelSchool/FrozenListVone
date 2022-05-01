package com.miguel.frozenlist.frozenlistvone.dtos

import lombok.*
import java.io.Serializable
import java.time.LocalDate

@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
class ProductDto : Serializable {
    val id: Long? = null
    val name: String? = null
    val durabilityDays: Int? = null
    val boughtAt: LocalDate? = null
    var image: String? = null
    val storageEntity: StorageDto? = null
    val brandEntity: BrandDto? = null
    val shoppingListEntities: MutableList<ShoppingListDto> = mutableListOf()
}
