package com.miguel.frozenlist.frozenlistvone.dtos

import lombok.*
import java.io.Serializable

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
class UserGroupDto : Serializable {
    var id: Long? = null
    var name: String? = null
    var address: AddressDto? = null
    var isValid: Boolean = false
    val storageEntity: MutableList<StorageDto> = mutableListOf()
    val recipes: MutableList<RecipeDto?> = mutableListOf()
    val favoritesRecipes: MutableList<RecipeDto> = mutableListOf()
    val shoppingListEntities: MutableList<ShoppingListDto?> = mutableListOf()
}
