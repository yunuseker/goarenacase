package com.kgteknoloji.goarenacase.data.defination

import android.support.annotation.StringDef

@StringDef(
    ErrorType.FROM_SERVICE,
    ErrorType.UNKNOWN,
    ErrorType.UNKNOWN_HOST,
    ErrorType.SOCKET_TIMEOUT,
    ErrorType.SERVICE
)
@Retention(AnnotationRetention.SOURCE)
annotation class ErrorType {
    companion object {
       const val FROM_SERVICE = "FROM_SERVICE"
       const val UNKNOWN = "UNKNOWN"
       const val UNKNOWN_HOST = "UNKNOWN_HOST"
       const val SOCKET_TIMEOUT = "SOCKET_TIMEOUT"
       const val SERVICE = "SERVICE"
    }
}