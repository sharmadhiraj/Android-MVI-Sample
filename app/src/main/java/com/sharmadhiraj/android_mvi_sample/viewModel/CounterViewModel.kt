package com.sharmadhiraj.android_mvi_sample.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sharmadhiraj.android_mvi_sample.intent.CounterIntent
import com.sharmadhiraj.android_mvi_sample.model.CounterModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class CounterViewModel : ViewModel() {

    private val _model = MutableStateFlow(CounterModel(0))
    val model: StateFlow<CounterModel> = _model

    fun handleIntent(intent: CounterIntent) {
        viewModelScope.launch {
            when (intent) {
                CounterIntent.IncrementIntent -> {
                    val currentModel = _model.value
                    _model.emit(currentModel.copy(counter = currentModel.counter + 1))
                }

                CounterIntent.DecrementIntent -> {
                    val currentModel = _model.value
                    _model.emit(currentModel.copy(counter = currentModel.counter - 1))
                }
            }
        }
    }
}
