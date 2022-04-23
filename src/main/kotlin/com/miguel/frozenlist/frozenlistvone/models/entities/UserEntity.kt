package com.miguel.frozenlist.frozenlistvone.models.entities

import lombok.*
import javax.persistence.*

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Users")
class UserEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null

    @Column(nullable = false, unique = true)
     var email : String? = null

    @Column(nullable = false)
    var password : String? = null

    @Column(nullable = false)
    var firstname : String? = null

    @Column(nullable = false)
    var lastname : String? = null

    @Column
    var dayOfBirth : String? = null

    @OneToMany
    lateinit var recipeEntity: List<RecipeEntity>

    @OneToMany
    lateinit var recipeFavorites : List<RecipeEntity>

    @OneToMany
    lateinit var ratings: List<RatingEntity>

    @ManyToOne
    lateinit var userRoleEntity: UserRoleEntity

    @ManyToOne
    lateinit var userGroupEntity: UserGroupEntity
}
