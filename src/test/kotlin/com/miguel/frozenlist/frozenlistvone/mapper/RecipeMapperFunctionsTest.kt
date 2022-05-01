package com.miguel.frozenlist.frozenlistvone.mapper

import com.miguel.frozenlist.frozenlistvone.dtos.RecipeDto
import com.miguel.frozenlist.frozenlistvone.models.entities.RecipeEntity

class RecipeMapperFunctionsTest {



    //TODO: complete Code after mapping ingredient, rating and usergroup
    companion object {
        @JvmStatic
        fun `get valid recipe dto list`(): List<RecipeDto>{
            val mockOne = RecipeDto()
                mockOne.name = "One-pan pasta"
                mockOne.category = "pasta"
                mockOne.description = "STEP 1\n" +
                        "Heat the oil in a deep, wide frying pan or casserole dish over a medium-high heat. Tip in the meatballs and cook for 5 mins, turning until browned all over. Add the onion and garlic, and fry for 8 more mins until softened.\n" +
                        "\n" +
                        "STEP 2\n" +
                        "Add the ketchup, chopped tomatoes, chopped basil and 400ml water to the pan and bring to the boil. Add the spaghetti and cook for 10-12 mins, stirring occasionally. When the pasta is cooked and the sauce has reduced, season and sprinkle with the basil leaves to serve."
                mockOne.isFavorite = false
                mockOne.isPrivateRecipe = false
                mockOne.duration = 30.0


            return listOf()
        }

        @JvmStatic
        fun `get invalid recipe dto list`(): List<RecipeDto>{

            return listOf()
        }

        @JvmStatic
        fun `get valid recipe entity list`(): List<RecipeEntity>{

            return listOf()
        }

        @JvmStatic
        fun `get invalid recipe entity list`(): List<RecipeEntity>{

            return listOf()
        }
    }
}
