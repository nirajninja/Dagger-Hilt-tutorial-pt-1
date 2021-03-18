package com.example.dagger_hilt

import android.util.Log
import javax.inject.Inject

class wheel{
    @Inject
    constructor()
    fun getWheel()
    {
        Log.d("main","this is wheel")
    }

}