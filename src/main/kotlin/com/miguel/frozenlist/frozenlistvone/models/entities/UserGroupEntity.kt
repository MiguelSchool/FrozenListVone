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
    private lateinit var storageEntity: List<StorageEntity>

    @OneToMany
    private lateinit var recipes: List<RecipeEntity>

    @OneToMany
    private lateinit var favoritesRecipes: List<RecipeEntity>

    @OneToMany
    private lateinit var shoppingListEntities: List<ShoppingListEntity>

    @OneToMany
    private lateinit var users: Set<UserEntity>

    @ManyToOne
    public lateinit var address: AddressEntity
}
