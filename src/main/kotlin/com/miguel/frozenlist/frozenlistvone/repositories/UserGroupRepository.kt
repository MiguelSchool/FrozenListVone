package com.miguel.frozenlist.frozenlistvone.repositories;

import com.miguel.frozenlist.frozenlistvone.models.entities.UserGroupEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface UserGroupRepository : JpaRepository<UserGroupEntity, Long> {
    fun createOrUpdate(entity: UserGroupEntity) : Pair<Boolean, UserGroupEntity> {
        val existing = if(entity.id != null) findById(entity.id!!) else Optional.ofNullable(null)
        val created: Boolean?
        val backEntity: UserGroupEntity = save(entity)
        created = !existing.isPresent
        return created to backEntity
    }
}
