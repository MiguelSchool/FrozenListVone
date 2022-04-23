package com.miguel.frozenlist.frozenlistvone.dtos

import lombok.*
import java.io.Serializable

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
class RecipeDto : Serializable {
    val id: Long? = null
    val isPrivateRecipe: Boolean? = null
    val duration: Double? = null
    val name: String? = null
    val cookedCount: Double? = null
    val category: String? = null
    val description: String? = null
    val image: String? = null
}
