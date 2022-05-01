package com.miguel.frozenlist.frozenlistvone.dtos

import com.miguel.frozenlist.frozenlistvone.models.Rating
import lombok.*
import java.io.Serializable


@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
class RatingDto : Serializable {
    val id: Long? = null
    var rating: Rating? = null
    var recipeDtoList: MutableList<RecipeDto> = mutableListOf()
    var isValid = false
}
