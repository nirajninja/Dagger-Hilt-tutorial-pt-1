package com.example.dagger_hilt

import android.util.Log
import javax.inject.Inject

class car @Inject constructor(private val engine: engine,private val wheel: wheel) {

    fun getcar()

    {
        engine.getEngine()
        wheel.getWheel()
        Log.d("Tag","this is daggerhilt demo")
    }
}