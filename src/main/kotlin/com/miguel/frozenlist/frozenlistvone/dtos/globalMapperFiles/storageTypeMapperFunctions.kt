package com.miguel.frozenlist.frozenlistvone.dtos.globalMapperFiles

import com.miguel.frozenlist.frozenlistvone.dtos.StorageDto
import com.miguel.frozenlist.frozenlistvone.dtos.StorageTypeDto
import com.miguel.frozenlist.frozenlistvone.exceptions.StorageTypeNotFoundException
import com.miguel.frozenlist.frozenlistvone.models.entities.StorageTypeEntity

internal val storageTypeDtoToEntity : (StorageTypeDto) -> StorageTypeEntity = {

    val storageEntityList = it.storageDtoList.map(storageDtoToEntity).toMutableList()
    val storageTypeEntity = StorageTypeEntity()
        storageTypeEntity.storageTypeName = it.storageTypeName ?: ""
        storageTypeEntity.storageEntityList = storageEntityList ?: mutableListOf()
    storageTypeEntity
}

internal val storageTypeEntityToDto : (StorageTypeEntity) -> StorageTypeDto = {

    if(it.storageTypeName == null || it.storageTypeName == "" ){
        throw StorageTypeNotFoundException("storage type not found")
    }
    val storageDtoList: MutableList<StorageDto> = it.storageEntityList.map(storageEntityToDto).toMutableList()
    val storageTypeDto = StorageTypeDto()
        storageTypeDto.storageTypeName = it.storageTypeName ?: ""
        storageTypeDto.storageDtoList = storageDtoList ?: mutableListOf()
        storageTypeDto.isValid = isValidStorageType(storageTypeDto)
    storageTypeDto
}

private val isValidStorageType : (StorageTypeDto) -> Boolean = {
    it.storageTypeName != null && it.storageTypeName!!.length > 3
}
