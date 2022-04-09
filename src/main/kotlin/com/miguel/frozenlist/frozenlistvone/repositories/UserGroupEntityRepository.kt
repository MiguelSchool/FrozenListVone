package com.miguel.frozenlist.frozenlistvone.repositories;

import com.miguel.frozenlist.frozenlistvone.models.entities.UserGroupEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserGroupEntityRepository : JpaRepository<UserGroupEntity, Long> {
}
