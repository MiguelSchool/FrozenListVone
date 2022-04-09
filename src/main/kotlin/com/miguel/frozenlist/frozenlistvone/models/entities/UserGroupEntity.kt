package com.miguel.frozenlist.frozenlistvone.models.entities

import lombok.Getter
import lombok.Setter
import lombok.ToString
import javax.persistence.*

@Entity
@ToString
@Getter
@Setter
class UserGroupEntity(
    @Id var id: Long,
    @Column(nullable = false) var name : String) {

    @ManyToOne
    private lateinit var address: AddressEntity

    @OneToMany
    private lateinit var storageEntity: List<StorageEntity>

    @OneToMany
    private lateinit var recipes: List<RecipeEntity>

    @OneToMany
    private lateinit var favoritesRecipes: List<RecipeEntity>

    @OneToMany
    private lateinit var shoppingListEntities: List<ShoppingListEntity>

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as UserGroupEntity

        if (id != other.id) return false
        if (name != other.name) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + name.hashCode()
        return result
    }


}
