package com.xyzterm.app

import com.rk.App
import com.rk.TerminalFeature
import com.rk.feature.FeatureRegistry

class XyzTermApplication : App() {
    override fun onCreate() {
        super.onCreate()

        // Register pluggable features. This build only ships the terminal.
        FeatureRegistry.register(TerminalFeature())

        // Initialize features
        FeatureRegistry.initFeatures(this)
    }
}
