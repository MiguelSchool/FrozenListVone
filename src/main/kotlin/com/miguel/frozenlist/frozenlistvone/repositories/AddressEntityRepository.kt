package com.miguel.frozenlist.frozenlistvone.repositories;

import com.miguel.frozenlist.frozenlistvone.models.entities.AddressEntity
import org.springframework.data.jpa.repository.JpaRepository

interface AddressEntityRepository : JpaRepository<AddressEntity, Long> {
}
