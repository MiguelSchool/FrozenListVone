package com.miguel.frozenlist.frozenlistvone.dtos.globalMapperFiles

import com.miguel.frozenlist.frozenlistvone.dtos.AddressDto
import com.miguel.frozenlist.frozenlistvone.dtos.validators.AddressValidator
import com.miguel.frozenlist.frozenlistvone.models.entities.AddressEntity
import java.util.regex.Matcher


internal val addressEntityToDto : (AddressEntity) -> AddressDto = { addressEntity : AddressEntity ->
    val addressDto = AddressDto()
    addressDto.street = addressEntity.street
    addressDto.streetNumber = addressEntity.streetNumber
    addressDto.postcode = addressEntity.postcode
    addressDto.city = addressEntity.city
    addressDto.floor = addressEntity.floor
    addressDto.isValid = isValidAddress(addressDto)
    addressDto
}

internal val addressDtoToEntity: (AddressDto) -> AddressEntity = { addressDto: AddressDto ->
    val addressEntity = AddressEntity()
    addressEntity.street = addressDto.street ?: ""
    addressEntity.streetNumber = addressDto.streetNumber ?: ""
    addressEntity.postcode = addressEntity.postcode ?: ""
    addressEntity.city = addressEntity.city ?: ""
    addressEntity.floor = addressDto.floor ?: ""
    addressEntity
}

private val isValidAddress : (AddressDto) -> Boolean = { addressDto: AddressDto ->
    val postCodePatter = AddressValidator.patternPostcode
    val streetPatter = AddressValidator.patternStreet
    val streetNumberPatter = AddressValidator.patternStreetNumber
    var isValidFloor = true

    var areValidProperties = false
    if (
        addressDto.street != null && addressDto.street != "" &&
        addressDto.streetNumber != null && addressDto.streetNumber != "" &&
        addressDto.postcode != null && addressDto.postcode != "" &&
        addressDto.city != null && addressDto.city != "" ) {

        val matcherPostCode: Matcher = postCodePatter.matcher(addressDto.postcode!!)
        val matcherStreet: Matcher = streetPatter.matcher(addressDto.street!!)
        val matcherStreetNumber: Matcher = streetNumberPatter.matcher(addressDto.streetNumber!!)
        if (addressDto.floor != "" && addressDto.floor != null) {
            isValidFloor = addressDto.floor!!.length < 4 && addressDto.floor!!.isNotEmpty()
        }
        addressDto.floor = addressDto.floor ?: ""
        areValidProperties = addressRegexPropertiesAudit(matcherPostCode, matcherStreet, matcherStreetNumber) &&
                addressDto.postcode!!.length == 5 && isValidFloor
    }

    areValidProperties
}

private val addressRegexPropertiesAudit:
            (postCodeMatcher : Matcher, streetMatcher : Matcher, streetNumberMatcher : Matcher ) -> Boolean = {
                postCodeMatcher, streetMatcher, streetNumberMatcher ->  postCodeMatcher.matches() &&
                                                                        streetMatcher.matches() &&
                                                                        streetNumberMatcher.matches()
}
