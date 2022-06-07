package com.miguel.frozenlist.frozenlistvone.dtos.globalMapperFiles
import com.miguel.frozenlist.frozenlistvone.dtos.StorageDto
import com.miguel.frozenlist.frozenlistvone.dtos.StorageTypeDto
import com.miguel.frozenlist.frozenlistvone.exceptions.StorageTypeNotFoundException
import com.miguel.frozenlist.frozenlistvone.models.entities.StorageEntity


internal val storageEntityToDto : (StorageEntity) -> StorageDto = {
    val storageDto = StorageDto()
        storageDto.name = it.storageName ?: ""
        storageDto.description = it.description ?: ""
        storageDto.storageTypeDto = storageTypeEntityToDto(it.storageTypeEntity) ?: StorageTypeDto()
        storageDto.isValid = isValidStorageDto(storageDto)
    storageDto
}

internal val storageDtoToEntity : (StorageDto) -> StorageEntity = {
    val storageEntity = StorageEntity()
        storageEntity.storageName = it.name ?: ""
        storageEntity.description = it.description ?: ""
    try {
        if(storageEntity.productEntityList == null) {
            storageEntity.productEntityList = mutableListOf()
        }
        if(storageEntity.userGroupEntity == null) {
            throw StorageTypeNotFoundException("need a userGroup")
        }
        storageEntity.storageTypeEntity = storageTypeDtoToEntity(it.storageTypeDto)
    }
    catch (e : Exception){}

    storageEntity
}

internal val storageEntityListToDto : (List<StorageEntity>) -> MutableList<StorageDto> = {
    val mutableList = mutableListOf<StorageDto>()
    it.map { entity -> mutableList.add( storageEntityToDto(entity) ) }
    mutableList
}

internal val storageDtoListToEntityList : (MutableList<StorageDto>) -> List<StorageEntity> = {
    val mutableList = mutableListOf<StorageEntity>()
    it.map { dto -> mutableList.add( storageDtoToEntity(dto))}
    mutableList.toList()
}

private val isValidStorageDto : (StorageDto) -> Boolean = {
    if(it.description == null) {
        it.description = ""
    }
    if(it.name == null) {
        it.name = ""
    }
    !(it.name == "" || it.description == "")
}
