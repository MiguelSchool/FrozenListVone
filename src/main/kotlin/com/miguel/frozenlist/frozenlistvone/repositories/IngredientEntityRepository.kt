package com.miguel.frozenlist.frozenlistvone.repositories;

import com.miguel.frozenlist.frozenlistvone.models.entities.IngredientEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface IngredientEntityRepository : JpaRepository<IngredientEntity, Long> {
    fun saveOrUpdate(entity:IngredientEntity) : Pair<Boolean, IngredientEntity> {
        val existing = if(entity.id != null) findById(entity.id!!) else Optional.ofNullable(null)
        val created: Boolean?
        val backEntity: IngredientEntity = save(entity)
        created = !existing.isPresent
        return created to backEntity
    }
}
