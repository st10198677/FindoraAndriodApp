package com.example.findoraapi;

import android.graphics.Bitmap
import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import java.time.LocalDate
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit

data class Event(
    var title: String = "",
    var organisers: String = "",
    var eventType: String = "",
    var date: String = "",
    var description: String = "",
    var startTime: String = "",
    var endTime: String = "",
    // var imageUrl: String? = null
    var imageBitmap: Bitmap?=null
)