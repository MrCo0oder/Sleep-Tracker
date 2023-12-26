package com.codebook.sleeptracker.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "daily_sleep_quality_table")
data class SleepNight(
    @PrimaryKey(autoGenerate = true)
    var nightId: Long = 0L,
    val startTimeMillis: Long = System.currentTimeMillis(),
    val endTimeMillis: Long = startTimeMillis,
    var sleepQuality: Int = -1
)
