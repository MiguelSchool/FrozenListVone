package com.miguel.frozenlist.frozenlistvone.models.entities

import com.miguel.frozenlist.frozenlistvone.models.DifficultLevel
import lombok.*
import javax.persistence.*

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Recipes")
class RecipeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, unique = true)
    var id: Long? = null

    @Column(nullable = false)
    var isPrivateRecipe : Boolean? = null

    @Column(nullable = false)
    var duration : Double? = null

    @Column(nullable = false)
    var recipeName : String? = null

    @Column(nullable = false)
    var cookedCount: Int? = null

    @Column(nullable = false)
    var category: String? = null

    @Column(nullable = false)
    var description: String? = null

    @Column(nullable = true)
    var image: String? = null

    @Column(nullable = true)
    var difficultLvl: DifficultLevel? = null

    @ManyToOne
    lateinit var userEntity: UserEntity

    @ManyToOne
    lateinit var ratingEntity: RatingEntity

    @ManyToOne
    lateinit var userGroupEntity: UserGroupEntity

    @ManyToOne
    lateinit var favoriteByUserGroupEntity: UserGroupEntity

    @ManyToOne
    lateinit var favoriteByUserEntity: UserEntity

    @ManyToMany
    lateinit var ingredientEntities: List<IngredientEntity>
}
