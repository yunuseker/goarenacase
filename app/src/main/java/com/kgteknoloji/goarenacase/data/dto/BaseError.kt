package com.kgteknoloji.goarenacase.data.dto

import com.kgteknoloji.goarenacase.data.defination.ErrorType

class BaseError(
    var errorCode: Int = 0,
    var errorMessage: String = "",
    @ErrorType var errorType: String
)