package com.miguel.frozenlist.frozenlistvone.dtos.globalMapperFiles
import com.miguel.frozenlist.frozenlistvone.dtos.StorageDto
import com.miguel.frozenlist.frozenlistvone.models.entities.StorageEntity


internal val storageEntityToDto : (StorageEntity) -> StorageDto = {
    val storageDto = StorageDto()
        storageDto.name = it.storageName ?: ""
        storageDto.description = it.description ?: ""
        storageDto.isValid = isValidStorageDto(storageDto)
    storageDto
}

internal val storageDtoToEntity : (StorageDto) -> StorageEntity = {
    val storageEntity = StorageEntity()
        storageEntity.storageName = it.name ?: ""
        storageEntity.description = it.description ?: ""
    storageEntity
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
