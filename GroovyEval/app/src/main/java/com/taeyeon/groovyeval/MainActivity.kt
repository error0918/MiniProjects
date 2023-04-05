package com.taeyeon.groovyeval

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.taeyeon.groovyeval.ui.theme.GroovyEvalTheme
import groovy.lang.Binding
import groovy.lang.GroovyShell

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GroovyEvalTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello ${a()}!",
        modifier = modifier
    )
}

fun a(): Any {
    val script = """
        def a = 10
        def b = 20
        println("a + b = ${'$'}{a + b}")
    """
    val binding = Binding()
    val shell = GroovyShell(binding)
    return shell.evaluate(script)
}