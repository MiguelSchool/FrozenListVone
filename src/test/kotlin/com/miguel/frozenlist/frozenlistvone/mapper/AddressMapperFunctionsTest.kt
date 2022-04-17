package com.miguel.frozenlist.frozenlistvone.mapper

import com.miguel.frozenlist.frozenlistvone.dtos.globalMapperFiles.addressEntityToDto
import com.miguel.frozenlist.frozenlistvone.models.entities.AddressEntity
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class AddressMapperFunctionsTest {

    @ParameterizedTest
    @MethodSource("getValidAddressEntities")
    fun `should be a valid address`(addressEntity: AddressEntity) {
        val dtoTemp = addressEntityToDto(addressEntity)
        assertNotNull(dtoTemp)
        assertTrue(dtoTemp.isValid)
    }

    @ParameterizedTest
    @MethodSource("getInvalidAddressEntities")
    fun `should be a invalid address`(addressEntity: AddressEntity) {
        val dtoTemp = addressEntityToDto(addressEntity)
        assertNotNull(dtoTemp)
        assertFalse(dtoTemp.isValid)
    }

    companion object {

        @JvmStatic
        fun getValidAddressEntities() : List<AddressEntity> {
            val mock1 = AddressEntity()
                mock1.street = "Musterstraße"
                mock1.streetNumber = "12"
                mock1.postcode = "64860"
                mock1.city = "Musterstadt"
                mock1.floor = "EG1"
            val mock2 = AddressEntity()
                mock2.street = "Am Berg"
                mock2.streetNumber = "4-10"
                mock2.postcode = "01111"
                mock2.city = "Musterstadt"
                mock2.floor = ""
            val mock3 = AddressEntity()
                mock3.street = "Konstantin-Allee"
                mock3.streetNumber = "12a"
                mock3.postcode = "23654"
                mock3.city = "Stadttest"
                mock3.floor = "OG1"
            val mock4 = AddressEntity()
                mock4.street = "Graf-von-Wagnerstraße"
                mock4.streetNumber = "100A"
                mock4.city = "Schaafhausen"
                mock4.postcode = "07645"
            val mock5 = AddressEntity()
                mock5.street = "Hans Georg Martin straße"
                mock5.streetNumber = "123"
                mock5.city = "Ödenburg"
                mock5.postcode = "12345"
                mock5.floor = "OG5"
            return listOf(
                mock1,
                mock2,
                mock3,
                mock4,
                mock5)
        }

        @JvmStatic
        fun getInvalidAddressEntities(): List<AddressEntity> {

            val mock1 =AddressEntity()
                mock1.street = "Musterstraße"
                mock1.streetNumber = "asA"
                mock1.postcode = "64860"
                mock1.city = "Musterstadt"
                mock1.floor = "EG1"
            val mock2 = AddressEntity()
                mock2.street = "Am Berg"
                mock2.streetNumber = "12"
                mock2.postcode = "011114"
                mock2.city = "Musterstadt"
                mock2.floor = ""
            val mock3 = AddressEntity()
                mock3.street = "@Allee#+"
                mock3.streetNumber = "12a"
                mock3.postcode = "23654"
                mock3.city = "Stadttest"
                mock3.floor = "OG1"
            val mock4 = AddressEntity()
                mock4.street = "Graf-von-Wagnerstraße"
                mock4.streetNumber = "100A"
                mock4.city = "Schaafhausen"
                mock4.postcode = "07645"
            val mock5 = AddressEntity()
                mock5.street = "Hans Georg Martin straße"
                mock5.streetNumber = "123"
                mock5.city = "Ödenburg"
                mock5.postcode = "12345"
                mock5.floor = "OG5xcy"
            val mock6 = AddressEntity()
                mock6.street = ""
                mock6.streetNumber = "Waldorfplatz"
                mock6.city = "However"
                mock6.postcode = "12345"
                mock6.floor = "1OG"
            return listOf(
                mock1,
                mock2,
                mock3,
                mock4,
                mock5,
                mock6 )
        }
    }
}
