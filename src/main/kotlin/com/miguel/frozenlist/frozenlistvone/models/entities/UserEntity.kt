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
    private var email : String? = null

    @Column(nullable = false)
    private var password : String? = null

    @Column(nullable = false)
    private var firstname : String? = null

    @Column(nullable = false)
    private var lastname : String? = null

    @Column
    private var dayOfBirth : String? = null

    @OneToMany
    private lateinit var recipeEntity: List<RecipeEntity>

    @OneToMany
    private lateinit var recipeFavorites : List<RecipeEntity>

    @OneToMany
    private lateinit var ratings: List<RatingEntity>

    @ManyToOne
    private lateinit var userRoleEntity: UserRoleEntity

    @ManyToOne
    private lateinit var userGroupEntity: UserGroupEntity
}
