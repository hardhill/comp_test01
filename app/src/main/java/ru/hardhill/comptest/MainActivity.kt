package ru.hardhill.comptest


import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion
import androidx.compose.ui.graphics.Color.Companion.Yellow


import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.*


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                ListItem(name = "Waclaw", prof = "programmer")
                ListItem(name = "Waclaw", prof = "programmer")
                ListItem(name = "Waclaw", prof = "programmer")
                ListItem(name = "Waclaw", prof = "programmer")
                ListItem(name = "Waclaw", prof = "programmer")
                ListItem(name = "Waclaw", prof = "programmer")
                ListItem(name = "Waclaw", prof = "programmer")
                ListItem(name = "Waclaw", prof = "programmer")
                ListItem(name = "Waclaw", prof = "programmer")
                ListItem(name = "Waclaw", prof = "programmer")
            }

        }
    }
}


@Composable
fun ListItem(name: String, prof: String) {
    var counter = remember {
        mutableStateOf(0)
    };
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 6.dp)
            .clickable {
                counter.value++
                Log.d("COMPOSE", counter.toString())
            },

        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp,
    ) {
        Box() {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.book_cat),
                    contentDescription = "image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(all = 10.dp)
                        .size(64.dp)
                        .clip(CircleShape)
                )
                Column(modifier = Modifier.padding(start = 10.dp)) {
                    Text(text = name)
                    Text(text = counter.value.toString())
                }
                CircleButton()
                Button(onClick = { counter.value = 0 },
                modifier = Modifier.clip(CircleShape)) {
                    Text(text = "Ok")
                }
            }
        }
    }
}

@Composable
fun CircleButton() {
    val counter = remember {
        mutableStateOf(0)
    }
    val color = remember {
        mutableStateOf(Companion.Yellow)
    }
    Box(
        modifier = Modifier
            .padding(all = 20.dp)
            .size(80.dp)
            .background(color = color.value, shape = CircleShape)
            .clickable {
                ++counter.value
                if (counter.value % 2 == 0) {
                    color.value = Companion.Red
                } else {
                    color.value = Companion.Green
                }
            },
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = counter.value.toString(),
            style = TextStyle(color = Companion.Black, fontSize = 20.sp)
        )
    }
}


