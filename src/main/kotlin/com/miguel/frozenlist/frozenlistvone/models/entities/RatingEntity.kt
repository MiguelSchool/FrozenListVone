package com.miguel.frozenlist.frozenlistvone.models.entities

import com.miguel.frozenlist.frozenlistvone.models.Rating
import javax.persistence.*

@Entity
class RatingEntity(private var rating: Rating) {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private var id: Long? = null

    @OneToMany
    private lateinit var recipeEntities:List<RecipeEntity>

}
