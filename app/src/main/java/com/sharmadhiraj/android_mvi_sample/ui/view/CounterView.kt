package com.sharmadhiraj.android_mvi_sample.ui.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sharmadhiraj.android_mvi_sample.intent.CounterIntent
import com.sharmadhiraj.android_mvi_sample.model.CounterModel
import com.sharmadhiraj.android_mvi_sample.viewModel.CounterViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CounterView(viewModel: CounterViewModel = viewModel()) {
    val model by viewModel.model.collectAsState()

    Scaffold(
        topBar = { TopAppBar(title = { Text("Counter App") }) },
        content = {
            Column(modifier = Modifier.padding(it)) {
                CounterContent(
                    model,
                    viewModel::handleIntent
                )
            }
        }
    )
}

@Composable
fun CounterContent(model: CounterModel, onIntent: (CounterIntent) -> Unit) {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .wrapContentHeight()
    ) {
        Text(
            text = "Counter: ${model.counter}",
            style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()
        ) {
            Button(
                onClick = { onIntent(CounterIntent.IncrementIntent) },
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 8.dp)
            ) {
                Text(text = "Increment")
            }
            Button(
                onClick = { onIntent(CounterIntent.DecrementIntent) },
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 8.dp)
            ) {
                Text(text = "Decrement")
            }
        }
    }
}

@Preview
@Composable
fun PreviewCounterView() {
    CounterView()
}
