package com.sharmadhiraj.android_mvi_sample.intent

sealed class CounterIntent {
    data object IncrementIntent : CounterIntent()
    data object DecrementIntent : CounterIntent()
}
