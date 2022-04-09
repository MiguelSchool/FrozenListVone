package com.miguel.frozenlist.frozenlistvone.dtos

import java.io.Serializable

data class StorageTypeEntityDto(val name: String? = null, val storageEntity: MutableList<StorageDto> = mutableListOf()) :
    Serializable
