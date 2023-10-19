package com.evanemran.gitcrawlr.utils

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.*

class AppDateFormatter {
    @SuppressLint("SimpleDateFormat")
    fun formatUpdatedDate(date: String): String {
        return try {
            var formatter = SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss'Z'")
            val newDate: Date = formatter.parse(date) as Date
            formatter = SimpleDateFormat("MM-dd-yy hh:ss")
            val formattedDate = formatter.format(newDate)

            formattedDate
        } catch (e: java.lang.Exception) {
            date
        }
    }
}
