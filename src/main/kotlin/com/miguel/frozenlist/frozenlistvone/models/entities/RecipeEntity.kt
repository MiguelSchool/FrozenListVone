package com.miguel.frozenlist.frozenlistvone.models.entities

import com.miguel.frozenlist.frozenlistvone.models.DifficultLevel
import lombok.EqualsAndHashCode
import lombok.Getter
import lombok.Setter
import lombok.ToString
import javax.persistence.*

@Entity
@ToString
@Getter
@Setter
@EqualsAndHashCode
class RecipeEntity(
    @Column(nullable = false) var isPrivateRecipe : Boolean,
    @Column(nullable = false) var duration : Double,
    @Column(nullable = false) var name : String,
    @Column(nullable = false) var cookedCount: Double,
    @Column(nullable = false) var category: String,
    @Column(nullable = false) var description: String,
    @Column(nullable = true) var image: String,
    var difficultLvl: DifficultLevel ) {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private var id: Long? = null

    @ManyToOne
    private lateinit var userEntity: UserEntity

    @ManyToMany
    private lateinit var ingredientEntities: List<IngredientEntity>

    @ManyToOne
    private lateinit var ratingEntity: RatingEntity
}
