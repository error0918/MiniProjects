package com.taeyeon.groovyeval

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.taeyeon.groovyeval.ui.theme.GroovyEvalTheme
import groovy.lang.GroovyShell
import org.codehaus.groovy.control.CompilerConfiguration
import org.codehaus.groovy.reflection.ReflectionCache
import org.objectweb.asm.Opcodes

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GroovyEvalTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    var text by remember { mutableStateOf("DATA") }

                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        SelectionContainer {
                            Text(
                                text = "TEXT: $text",
                                style = MaterialTheme.typography.titleLarge,
                                modifier = Modifier.verticalScroll(rememberScrollState())
                            )
                        }
                        Button(
                            onClick = {
                                text = "INIT"
                            }
                        ) {
                            Text(text = "INIT")
                        }
                        Button(
                            onClick = {
                                text = "1-1"
                                try {
                                    val script = "def a = 10\n" +
                                            "def b = 10\n" +
                                            "a + b"
                                    val shell = GroovyShell()
                                    text = "1-2"
                                    shell.evaluate(script)
                                    text = "1-3"
                                } catch (e: Exception) {
                                    text = e.toString()
                                }
                            }
                        ) {
                            Text(text = "TEST 1")
                        }
                        Button(
                            onClick = {
                                text = "2-1"
                                //Missed Class: java.lang.ClassValue
                                ReflectionCache.OBJECT_ARRAY_CLASS
                                text = "2-2"
                            }
                        ) {
                            Text(text = "TEST 2")
                        }
                    }
                }
            }
        }
    }
}