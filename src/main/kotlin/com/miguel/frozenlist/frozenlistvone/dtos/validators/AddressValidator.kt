package com.miguel.frozenlist.frozenlistvone.dtos.validators

import java.util.regex.Pattern

object AddressValidator {
    private val regexPostcode: String = "\\d\\d\\d\\d\\d";
    private val regexStreetNumber: String = "([\\d-]*)\\s*([\\w])?\$";
    private val regexStreet: String = "[a-zA-Zß\\söäü-]+[^0-9?%\$§()]"

    val patternPostcode: Pattern = Pattern.compile(regexPostcode);
    val patternStreetNumber: Pattern = Pattern.compile(regexStreetNumber);
    val patternStreet: Pattern = Pattern.compile(regexStreet);
}
