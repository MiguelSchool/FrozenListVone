package com.miguel.frozenlist.frozenlistvone.dtos.globalMapperFiles

import com.miguel.frozenlist.frozenlistvone.dtos.RatingDto
import com.miguel.frozenlist.frozenlistvone.exceptions.BodyIsEmptyException
import com.miguel.frozenlist.frozenlistvone.models.entities.RatingEntity

internal val ratingDtoToEntity: (RatingDto?) -> RatingEntity = {
    if (it == null) {
        throw BodyIsEmptyException("body for rating dto is empty")
    }
    val recipeEntityList = it.recipeDtoList.map(recipeDtoToEntity).toMutableList()
    val ratingEntity = RatingEntity()
        ratingEntity.rating = it.rating
        ratingEntity.recipeEntities = recipeEntityList
    ratingEntity
}

internal val ratingEntityToDto : (RatingEntity) -> RatingDto = {
    val ratingDto = RatingDto()
        ratingDto.rating = it.rating
        ratingDto.recipeDtoList = it.recipeEntities.map(recipeEntityToDto).toMutableList()
        ratingDto.isValid = isValidRatingDto(ratingDto)
    ratingDto
}

private fun isValidRatingDto(ratingDto : RatingDto): Boolean {
    return ratingDto.rating !== null
}
