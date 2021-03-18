package com.example.dagger_hilt

import android.util.Log
import javax.inject.Inject

class car {
    @Inject
    constructor()
    fun getcar()
    {
        Log.d("Tag","this is daggerhilt demo")
    }
}