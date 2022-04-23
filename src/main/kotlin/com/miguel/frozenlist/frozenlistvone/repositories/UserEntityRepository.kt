package com.miguel.frozenlist.frozenlistvone.repositories;

import com.miguel.frozenlist.frozenlistvone.models.entities.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface UserEntityRepository : JpaRepository<UserEntity, Long> {
    fun saveOrUpdate(entity: UserEntity) : Pair<Boolean, UserEntity> {
        val existing = if(entity.id != null) findById(entity.id!!) else Optional.ofNullable(null)
        val created: Boolean?
        val backEntity: UserEntity = save(entity)
        created = !existing.isPresent
        return created to backEntity
    }
}
