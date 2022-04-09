package com.miguel.frozenlist.frozenlistvone.models.entities

import lombok.EqualsAndHashCode
import lombok.Getter
import lombok.Setter
import lombok.ToString
import javax.persistence.*

@Entity
@ToString
@EqualsAndHashCode
@Getter
@Setter
class UserEntity(
    @Id @GeneratedValue(strategy = GenerationType.AUTO) private var id:Long,
    @Column(nullable = false) private var email : String,
    @Column(nullable = false) private var password : String,
    @Column(nullable = false) private var firstname : String,
    @Column(nullable = false) private var lastname : String,
    private var dayOfBirth : String?,
    ) {


    @ManyToOne
    private lateinit var userGroupEntity: UserGroupEntity

    @OneToMany
    private lateinit var recipeEntity: List<RecipeEntity>

    @ManyToOne
    private lateinit var userRoleEntity: UserRoleEntity
}
