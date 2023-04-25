package com.example.traineeingproject

import android.os.Bundle
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAbsoluteAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.traineeingproject.ui.theme.TraineeingProjectTheme

class MailUsingJetpackCompose : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TraineeingProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background,

                    )
                {
                    mail()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun mail() {
    var text1 by remember { mutableStateOf(value = "") }
    var text2 by remember { mutableStateOf(value = "") }
    var text3 by remember { mutableStateOf(value = "") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .padding(2.dp),
        horizontalAlignment = Alignment.Start
    ) {
        TextField(
            value = text1,
            onValueChange = {
                text1 = it
            },
            Modifier.fillMaxWidth(),
            textStyle = TextStyle(color = Color.Blue),
            placeholder = {
                Text(text = "To:")
            },
            singleLine = true
        )
        TextField(
            value = text2,
            onValueChange = {
                text2 = it
            },
            Modifier.fillMaxWidth(),
            textStyle = TextStyle(color = Color.Blue),
            placeholder = {
                Text(text = "Subject:")
            },
            singleLine = true
        )
        TextField(
            value = text3,
            onValueChange = {
                text3 = it
            },
            Modifier.fillMaxWidth(),
            textStyle = TextStyle(color = Color.Blue),
            placeholder = {
                Text(text = "Message")
            },
            maxLines = 20

        )
        Column(
            modifier = Modifier
                .fillMaxSize().padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom

        ) {
            Button(onClick = { /*TODO*/ },
            Modifier.fillMaxWidth()) {
                Text(text = "SEND")
            }
        }
    }
}