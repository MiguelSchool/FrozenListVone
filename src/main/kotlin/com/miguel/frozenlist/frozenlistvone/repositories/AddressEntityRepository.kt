package com.miguel.frozenlist.frozenlistvone.repositories;

import com.miguel.frozenlist.frozenlistvone.models.entities.AddressEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface AddressEntityRepository : JpaRepository<AddressEntity, Long> {

    fun createOrUpdate(entity: AddressEntity) : Pair<Boolean,AddressEntity> {
        val existing = if(entity.id != null) findById(entity.id!!) else Optional.ofNullable(null)
        val created: Boolean?
        val backEntity: AddressEntity = save(entity)
        created = !existing.isPresent
        return created to backEntity
    }
}
