package com.app.googlemapskotlin

import android.util.Log
import org.junit.Test

import org.junit.Assert.*

class ExampleUnitTest {
    private val simpleTag = this::class.java.simpleName

    @Test
    fun addition_isCorrect() {
        Log.d(simpleTag, "additionIsCorrect hit.")
        assertEquals(4, 2 + 2)
    }
}
