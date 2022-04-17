package com.miguel.frozenlist.frozenlistvone.repositories;

import com.miguel.frozenlist.frozenlistvone.models.entities.ShoppingListEntity
import com.miguel.frozenlist.frozenlistvone.models.entities.StorageEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

//@Repository
interface StorageEntityRepository : JpaRepository<StorageEntity, Long> {
    fun createOrUpdate(entity: StorageEntity) : Pair<Boolean, StorageEntity> {
        val existing = if(entity.id != null) findById(entity.id!!) else Optional.ofNullable(null)
        val created: Boolean?
        val backEntity: StorageEntity = save(entity)
        created = !existing.isPresent
        return created to backEntity
    }
}