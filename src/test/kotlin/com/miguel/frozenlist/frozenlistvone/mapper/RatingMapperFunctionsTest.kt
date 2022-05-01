package com.miguel.frozenlist.frozenlistvone.mapper

import com.miguel.frozenlist.frozenlistvone.dtos.RatingDto
import com.miguel.frozenlist.frozenlistvone.dtos.RecipeDto
import com.miguel.frozenlist.frozenlistvone.models.DifficultLevel
import com.miguel.frozenlist.frozenlistvone.models.Rating
import com.miguel.frozenlist.frozenlistvone.models.entities.RatingEntity
import com.miguel.frozenlist.frozenlistvone.models.entities.RecipeEntity
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class RatingMapperFunctionsTest {

    @ParameterizedTest
    @MethodSource("valid RatingDtos")
    fun `should be valid rating entities`(ratingDto: RatingDto) {
        val expected = RatingEntity()
            expected.rating = ratingDto.rating
        val mockList= mutableListOf<RecipeEntity>()
        ratingDto.recipeDtoList.map {
                val recipeEntity = RecipeEntity()
                    recipeEntity.recipeName = it.name ?: ""
                    recipeEntity.description = it.description ?: ""
                    recipeEntity.isFavorite = it.isFavorite ?: false
                    recipeEntity.duration = it.duration ?: 0.0
                    recipeEntity.category = it.category ?: ""
                    recipeEntity.difficultLvl = it.difficultLvl ?: DifficultLevel.EASY
                    recipeEntity.cookedCount = it.cookedCount ?: 0
                    recipeEntity.image = it.image ?: ""

                mockList.add(recipeEntity)
            }
        expected.recipeEntities = mockList
        val result = ratingDtoToEntity(ratingDto)
        assertNotNull(result)

    }

    companion object {

        @JvmStatic
        fun `valid RatingDtos`() : List<RatingDto>{
            val mockOne = RatingDto()
                mockOne.rating = Rating.ONE_AND_HALF
            getDefaultRecipeDtos().map { mockOne.recipeDtoList = mutableListOf(it) }
            val mockTwo = RatingDto()
                mockTwo.rating = Rating.FOUR_AND_HALF
            getDefaultRecipeDtos().map { mockTwo.recipeDtoList = mutableListOf(it) }
            val mockThree = RatingDto()
                mockThree.rating = Rating.FOUR
                mockThree.recipeDtoList = emptyList<RecipeDto>().toMutableList()
            return listOf(mockOne, mockTwo, mockThree)
        }

        @JvmStatic
        fun `invalid RatingDtos`() : List<RatingDto?> {
            val mockOne : RatingDto? = null
            val mockTwo = RatingDto()
                mockTwo.rating = null
                mockTwo.recipeDtoList = emptyList<RecipeDto>().toMutableList()
            return listOf(mockOne,mockTwo)
        }

        @JvmStatic
        fun `valid  RatingEntities`() : List<RatingEntity> {
            val mockOne = RatingEntity()
                mockOne.rating  = Rating.FOUR
                mockOne.recipeEntities = getDefaultRecipeEntities()
            val mockTwo = RatingEntity()
                mockTwo.rating = Rating.ONE_AND_HALF
                mockTwo.recipeEntities = getDefaultRecipeEntities()
            val mockThree = RatingEntity()
                mockThree.rating = Rating.FIVE
                mockThree.recipeEntities = emptyList<RecipeEntity>().toMutableList()
            return listOf(mockOne,mockTwo, mockThree)
        }

        @JvmStatic
        fun `invalid RatingEntities`() : List<RatingEntity?> {
            val mockOne : RatingEntity? = null
            val mockTwo = RatingEntity()
                mockTwo.rating = null
                mockTwo.recipeEntities = emptyList<RecipeEntity>().toMutableList()
            return listOf(mockOne, mockTwo)
        }
    }
}

private fun getDefaultRecipeDtos(): List<RecipeDto> {
    val mOne = RecipeDto()
        mOne.name = "lorem"
        mOne.duration = 3.3
    val mutableList = mutableListOf<RecipeDto>()

    repeat(5) {
        mutableList.add(mOne)
    }
    return mutableList
}

private fun getDefaultRecipeEntities(): List<RecipeEntity> {
    val mOne = RecipeEntity()
    mOne.recipeName = "lorem"
    mOne.duration = 3.3
    val mutableList = mutableListOf<RecipeEntity>()

    repeat(5) {
        mutableList.add(mOne)
    }
    return mutableList
}
