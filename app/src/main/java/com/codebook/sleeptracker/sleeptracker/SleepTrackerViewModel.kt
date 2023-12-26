package com.codebook.sleeptracker.sleeptracker

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.codebook.sleeptracker.database.SleepDatabaseDao

/**
 * ViewModel for SleepTrackerFragment.
 */
class SleepTrackerViewModel(
    val database: SleepDatabaseDao,
    application: Application) : AndroidViewModel(application) {
}

