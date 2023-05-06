package com.newtechieblog.wordpress.cupcakeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import com.newtechieblog.wordpress.cupcakeapp.ui.theme.CupcakeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            CupcakeTheme {
                CupcakeApp()
            }
        }
    }
}
