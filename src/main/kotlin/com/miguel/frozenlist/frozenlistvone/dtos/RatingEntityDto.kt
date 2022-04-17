package com.miguel.frozenlist.frozenlistvone.dtos

import com.miguel.frozenlist.frozenlistvone.models.Rating
import lombok.*
import java.io.Serializable

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
class RatingEntityDto : Serializable {
    val rating: Rating? = null
    val recipeEntities: MutableList<RecipeDto> = mutableListOf()
}
