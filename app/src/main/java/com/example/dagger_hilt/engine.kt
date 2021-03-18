package com.example.dagger_hilt

import android.util.Log
import javax.inject.Inject

class engine {
    @Inject
    constructor()
    fun getEngine()
    {
        Log.d("main","this is wheel")
    }
}