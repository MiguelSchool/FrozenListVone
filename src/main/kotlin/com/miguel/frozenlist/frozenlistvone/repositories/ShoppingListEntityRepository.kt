package com.miguel.frozenlist.frozenlistvone.repositories;

import com.miguel.frozenlist.frozenlistvone.models.entities.RecipeEntity
import com.miguel.frozenlist.frozenlistvone.models.entities.ShoppingListEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface ShoppingListEntityRepository : JpaRepository<ShoppingListEntity, Long> {
    fun createOrUpdate(entity: ShoppingListEntity) : Pair<Boolean, ShoppingListEntity> {
        val existing = if(entity.id != null) findById(entity.id!!) else Optional.ofNullable(null)
        val created: Boolean?
        val backEntity: ShoppingListEntity = save(entity)
        created = !existing.isPresent
        return created to backEntity
    }
}
