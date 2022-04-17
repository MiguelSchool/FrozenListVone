package com.miguel.frozenlist.frozenlistvone.repositories;

import com.miguel.frozenlist.frozenlistvone.models.entities.UserEntity
import com.miguel.frozenlist.frozenlistvone.models.entities.UserRoleEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface UserRoleEntityRepository : JpaRepository<UserRoleEntity, Long> {

    fun createOrUpdate(entity: UserRoleEntity) : Pair<Boolean, UserRoleEntity> {
        val existing = if(entity.id != null) findById(entity.id!!) else Optional.ofNullable(null)
        val created: Boolean?
        val backEntity: UserRoleEntity = save(entity)
        created = !existing.isPresent
        return created to backEntity
    }
}
