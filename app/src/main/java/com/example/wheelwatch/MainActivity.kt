package com.example.wheelwatch

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.wheelwatch.ui.theme.WheelWatchTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WheelWatchTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    content = { padding ->
                        Column(
                            modifier = Modifier
                                .padding(padding)
                                .fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            // Load and display the icon from drawable
                            IconSection()

                            Spacer(modifier = Modifier.height(16.dp))

                            Text(text = "Welcome to Wheel Watch")
                        }
                    }
                )
            }
        }
    }
}

@Composable
fun IconSection() {
    // Display the icon from the drawable resource folder
    Image(
        painter = painterResource(id = R.drawable.wheelwatch_icon),  // No file extension here
        contentDescription = "Wheel Watch Icon",
        modifier = Modifier.size(128.dp)  // Adjust size as needed
    )
}
