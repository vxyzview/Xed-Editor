package com.rk

import androidx.lifecycle.lifecycleScope
import com.rk.activities.settings.SettingsActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope

// same as SettingsActivity.lifeCycleScope
@OptIn(DelicateCoroutinesApi::class)
val DefaultScope: CoroutineScope
    get() {
        return SettingsActivity.instance?.lifecycleScope ?: GlobalScope
    }
