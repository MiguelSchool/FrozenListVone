package com.miguel.frozenlist.frozenlistvone.mapper

import com.miguel.frozenlist.frozenlistvone.dtos.globalMapperFiles.storageEntityListToDto
import com.miguel.frozenlist.frozenlistvone.dtos.globalMapperFiles.storageEntityToDto
import com.miguel.frozenlist.frozenlistvone.models.entities.StorageEntity
import com.miguel.frozenlist.frozenlistvone.models.entities.StorageTypeEntity
import com.miguel.frozenlist.frozenlistvone.models.entities.UserGroupEntity
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import org.mockito.kotlin.mock
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class StorageMapperTest {

    @ParameterizedTest
    @MethodSource("getValidStorageEntities")
    fun `should return mutable list of storageEntities`(entities:  MutableList<StorageEntity>) {
        val result = storageEntityListToDto(entities)
        assertNotNull(result)

        result.forEach { dto -> assertTrue(dto.isValid) }
    }

    @ParameterizedTest
    @MethodSource("getValidStorageEntities")
    fun `should return dto`(entity:StorageEntity) {
        val result = storageEntityToDto(entity)
        assertNotNull(result)
    }


    companion object {

        @JvmStatic
        fun getValidStorageEntities(): MutableList<StorageEntity> {
            val mockOne = StorageEntity()
                mockOne.storageTypeEntity = StorageTypeEntity()
                mockOne.storageTypeEntity.storageTypeName = "Whatever"

                mockOne.storageName = "mockOne"
                mockOne.description= "LoremIpsum"
                mockOne.userGroupEntity = UserGroupEntity()
                mockOne.id = 0
                mockOne.productEntityList = listOf()
            val mockTwo = StorageEntity()
                mockTwo.storageName = "mockTwo"
                mockTwo.description= "LoremIpsum"
                mockTwo.userGroupEntity = UserGroupEntity()
                mockTwo.id = 0
           return mutableListOf(mockOne, mockTwo)
        }
    }
}
