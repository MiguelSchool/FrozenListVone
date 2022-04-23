package com.miguel.frozenlist.frozenlistvone.repositories;

import com.miguel.frozenlist.frozenlistvone.models.entities.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface UserEntityRepository : JpaRepository<UserEntity, Long> {}
