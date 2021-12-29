package com.example.mapboxtest

import android.app.Application
import com.mapbox.android.core.location.LocationEngineProvider
import com.mapbox.search.MapboxSearchSdk

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        MapboxSearchSdk.initialize(
            application = this,
            accessToken = getString(R.string.access_token),
            locationEngine = LocationEngineProvider.getBestLocationEngine(this)
        )
    }
}