package com.miguel.frozenlist.frozenlistvone.repositories;

import com.miguel.frozenlist.frozenlistvone.models.entities.RatingEntity
import com.miguel.frozenlist.frozenlistvone.models.entities.RecipeEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface RecipeEntityRepository : JpaRepository<RecipeEntity, Long> {
    fun createOrUpdate(entity: RecipeEntity) : Pair<Boolean, RecipeEntity> {
        val existing = if(entity.id != null) findById(entity.id!!) else Optional.ofNullable(null)
        val created: Boolean?
        val backEntity: RecipeEntity = save(entity)
        created = !existing.isPresent
        return created to backEntity
    }
}
