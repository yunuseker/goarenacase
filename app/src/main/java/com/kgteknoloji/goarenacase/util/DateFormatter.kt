package com.kgteknoloji.goarenacase.util

import android.text.format.DateFormat
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*


class DateFormatter{

    fun convertDate(rawDate: String): String {
        var parsedDate = ""
        val format = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
        try {
            val date = format.parse(rawDate)
            parsedDate = DateFormat.format("dd.MM.yyyy", date.getTime()).toString()
        } catch (e: ParseException) {
            e.printStackTrace()
        }

        return parsedDate
    }
}