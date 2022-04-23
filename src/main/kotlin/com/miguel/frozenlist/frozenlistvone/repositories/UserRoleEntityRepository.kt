package com.miguel.frozenlist.frozenlistvone.repositories;

import com.miguel.frozenlist.frozenlistvone.models.entities.UserRoleEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface UserRoleEntityRepository : JpaRepository<UserRoleEntity, Long> { }
