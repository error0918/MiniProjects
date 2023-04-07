package com.taeyeon.groovyeval

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
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
                    Text(text = "Hello ${a()}!")
                }
            }
        }
    }
}

fun a(): Int {
    val script = """
        def a = 10
        def b = 20
        a + b
    """
    val binding = Binding()
    val shell = GroovyShell(binding)
    shell.evaluate(script)
    //val binding = Binding()
    //val shell = GroovyShell(binding)
    //shell.parse(script).run() as Int
    //return shell.evaluate(script) as Int
    //return shell.evaluate(script) as Int
    return 1
}