package com.example.mapboxtest.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.mapboxtest.network.ApiConfig
import kotlinx.coroutines.channels.BroadcastChannel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.*

class MainViewModel : ViewModel() {

    val queryChannel = BroadcastChannel<String>(Channel.CONFLATED)

    val searchResult = queryChannel.asFlow()
        .debounce(300)
        .distinctUntilChanged()
        .filter {
            it.trim().isNotEmpty()
        }
        .mapLatest {
            ApiConfig.provideApiService().getCountry(it, "pk.eyJ1Ijoibml0aW5ybWFsaWsxNiIsImEiOiJja3hsbWg3dWoxNWkxMnFxazJ1eGx6cXFqIn0.zLS0rKwWkgqSEiHMQZraOA",true).features
        }
        .asLiveData()
}