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
    var name : String? = null

    @Column(nullable = false)
    var cookedCount: Double? = null

    @Column(nullable = false)
    var category: String? = null

    @Column(nullable = false)
    var description: String? = null

    @Column(nullable = true)
    var image: String? = null

    @Column(nullable = true)
    var difficultLvl: DifficultLevel? = null

    @ManyToOne
    private lateinit var userEntity: UserEntity

    @ManyToOne
    private lateinit var ratingEntity: RatingEntity

    @ManyToOne
    private lateinit var userGroupEntity: UserGroupEntity

    @ManyToOne
    private lateinit var favoriteByUserGroupEntity: UserGroupEntity

    @ManyToOne
    private lateinit var favoriteByUserEntity: UserEntity

    @ManyToMany
    private lateinit var ingredientEntities: List<IngredientEntity>
}
