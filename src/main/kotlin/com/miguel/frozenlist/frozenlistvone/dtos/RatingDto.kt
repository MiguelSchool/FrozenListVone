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
class RatingDto : Serializable {
    val id: Long? = null
    val rating: Rating? = null
    val recipeEntities: MutableList<RecipeDto> = mutableListOf()
}
