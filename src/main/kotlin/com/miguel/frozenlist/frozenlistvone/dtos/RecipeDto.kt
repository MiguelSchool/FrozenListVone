package com.miguel.frozenlist.frozenlistvone.dtos

import com.miguel.frozenlist.frozenlistvone.models.DifficultLevel
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
    var difficultLvl: DifficultLevel? = null
    var user : UserDto? = null
    var rating: RatingDto? = null
    var favoriteByUserGroupDto: UserDto? = null
    var favoriteByUSerGroupEntity: UserGroupDto? = null
    var ingredientDtos : List<IngredientDto> = mutableListOf()
}
