package com.miguel.frozenlist.frozenlistvone.repositories;

import com.miguel.frozenlist.frozenlistvone.models.entities.BrandEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface BrandEntityRepository : JpaRepository<BrandEntity, Long> {

    fun saveOrUpdate(entity: BrandEntity) : Pair<Boolean, BrandEntity> {
        val existing = if(entity.id != null) findById(entity.id!!) else Optional.ofNullable(null)
        val created: Boolean?
        val backEntity: BrandEntity = save(entity)
        created = !existing.isPresent
        return created to backEntity
    }
}
