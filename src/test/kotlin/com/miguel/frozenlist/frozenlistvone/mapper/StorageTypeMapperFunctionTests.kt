package com.miguel.frozenlist.frozenlistvone.mapper

import com.miguel.frozenlist.frozenlistvone.dtos.StorageDto
import com.miguel.frozenlist.frozenlistvone.dtos.StorageTypeDto
import com.miguel.frozenlist.frozenlistvone.dtos.globalMapperFiles.storageDtoToEntity
import com.miguel.frozenlist.frozenlistvone.dtos.globalMapperFiles.storageEntityToDto
import com.miguel.frozenlist.frozenlistvone.dtos.globalMapperFiles.storageTypeDtoToEntity
import com.miguel.frozenlist.frozenlistvone.dtos.globalMapperFiles.storageTypeEntityToDto
import com.miguel.frozenlist.frozenlistvone.exceptions.StorageTypeNotFoundException
import com.miguel.frozenlist.frozenlistvone.models.entities.StorageEntity
import com.miguel.frozenlist.frozenlistvone.models.entities.StorageTypeEntity
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class StorageTypeMapperFunctionTests {

    @ParameterizedTest
    @MethodSource("getListOfValidStorageTypeEntities")
    fun `should be valid Storage types`(storageTypeEntity: StorageTypeEntity) {
        val expected = StorageTypeDto()
            expected.storageTypeName = storageTypeEntity.storageTypeName
            expected.storageDtoList = storageTypeEntity.storageEntityList.map(storageEntityToDto).toMutableList()
        val result = storageTypeEntityToDto(storageTypeEntity)
        assertNotNull(result)
        assertEquals(expected.storageTypeName, result.storageTypeName)
        assertEquals(expected.storageDtoList, result.storageDtoList)
        assertTrue(result.isValid)
    }

    @ParameterizedTest
    @MethodSource("getListOfInvalidStorageTypeEntities")
    fun `should be invalid storage types`(storageTypeEntity: StorageTypeEntity) {
        assertThrows(StorageTypeNotFoundException::class.java) {
            storageTypeEntityToDto(storageTypeEntity)
        }
    }

    @Test
    fun `should map dto to entity`() {
        val dto = StorageTypeDto()
            dto.storageTypeName = "Freezer"
            dto.storageDtoList = mutableListOf(StorageDto(),StorageDto())
        val expected = StorageTypeEntity()
            expected.storageTypeName = dto.storageTypeName
            expected.storageEntityList = dto.storageDtoList.map(storageDtoToEntity).toMutableList()
        val result = storageTypeDtoToEntity(dto)
        assertNotNull(result)
        assertEquals(result.storageTypeName, expected.storageTypeName)
        assertEquals(result.storageEntityList.size, expected.storageEntityList.size)
    }
    companion object {

        @JvmStatic
        fun getListOfValidStorageTypeEntities() : List<StorageTypeEntity> {
            val mockOne = StorageTypeEntity()
                mockOne.storageTypeName = "Freezer"
                mockOne.storageEntityList = mutableListOf<StorageEntity>(

                )
            val mockTwo = StorageTypeEntity()
                mockTwo.storageTypeName = "Fridge"
                mockTwo.storageEntityList = mutableListOf<StorageEntity>()
            return listOf(mockOne, mockTwo)
        }

        @JvmStatic
        fun getListOfInvalidStorageTypeEntities() : List<StorageTypeEntity> {
            val mockOne = StorageTypeEntity()
                mockOne.storageTypeName = null
                mockOne.storageEntityList = mutableListOf()
            val mockTwo = StorageTypeEntity()
                mockTwo.storageTypeName = ""
                mockTwo.storageEntityList = mutableListOf()
            return listOf(mockOne, mockTwo)
        }
    }
}
