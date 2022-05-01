package com.miguel.frozenlist.frozenlistvone.dtos

import lombok.*
import java.io.Serializable


@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
class RecipeDto : Serializable {
    val id: Long? = null
    var isPrivateRecipe: Boolean? = null
    var duration: Double? = null
    var name: String? = null
    var cookedCount: Int? = null
    var category: String? = null
    var description: String? = null
    var image: String? = null
    var isFavorite: Boolean = false
}
