package com.miguel.frozenlist.frozenlistvone.repositories;

import com.miguel.frozenlist.frozenlistvone.models.entities.StorageEntity
import com.miguel.frozenlist.frozenlistvone.models.entities.StorageTypeEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface StorageTypeEntityRepository : JpaRepository<StorageTypeEntity, Long> {

    fun createOrUpdate(entity: StorageTypeEntity) : Pair<Boolean, StorageTypeEntity> {
        val existing = if(entity.id != null) findById(entity.id!!) else Optional.ofNullable(null)
        val created: Boolean?
        val backEntity: StorageTypeEntity = save(entity)
        created = !existing.isPresent
        return created to backEntity
    }
}
