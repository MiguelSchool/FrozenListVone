package com.miguel.frozenlist.frozenlistvone.repositories;

import com.miguel.frozenlist.frozenlistvone.models.entities.ProductEntity
import com.miguel.frozenlist.frozenlistvone.models.entities.RatingEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface RatingEntityRepository : JpaRepository<RatingEntity, Long> {
    fun createOrUpdate(entity: RatingEntity) : Pair<Boolean, RatingEntity> {
        val existing = if(entity.id != null) findById(entity.id!!) else Optional.ofNullable(null)
        val created: Boolean?
        val backEntity: RatingEntity = save(entity)
        created = !existing.isPresent
        return created to backEntity
    }
}
