package com.miguel.frozenlist.frozenlistvone.models.entities

import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import javax.persistence.*

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "UserGroups")
class UserGroupEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null
    @Column(nullable = false, unique = true)
    var userGroupName : String? = null

    @OneToMany
    lateinit var storageEntity: List<StorageEntity>

    @OneToMany
    lateinit var recipes: List<RecipeEntity>

    @OneToMany
    lateinit var favoritesRecipes: List<RecipeEntity>

    @OneToMany
    lateinit var shoppingListEntities: List<ShoppingListEntity>

    @OneToMany
    lateinit var users: Set<UserEntity>

    @ManyToOne
    lateinit var address: AddressEntity
}
