package com.example.cuadrantecomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cuadrantecomposable.ui.theme.CuadranteComposableTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CuadranteComposableTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Cuadrante()
                }
            }
        }
    }
}

@Composable
fun Cuadrante() {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(modifier = Modifier
            .fillMaxHeight(0.5f)
            //.border(1.dp, Color.Red)
        ){
            Column(
                modifier = Modifier
                    //.background(Color.Green)
                    .fillMaxWidth(0.5f)
                    .fillMaxHeight()
            ) {
                CuadranteCard(
                    titulo = stringResource(id = R.string.text_composable_title),
                    texto=stringResource(id = R.string.text_composable_text),
                    badgroundColor=Color.Green
                )
            }
            Column(modifier = Modifier
                //.background(Color.Yellow)
                .fillMaxWidth()
                .fillMaxHeight()
            ) {
                CuadranteCard(
                    titulo = stringResource(id = R.string.image_composable_title),
                    texto=stringResource(id = R.string.image_composable_text),
                    badgroundColor=Color.Yellow
                )
            }
        }
        Row(
        ){
            Column(
                modifier = Modifier
//                    .background(Color.Cyan)
                    .fillMaxWidth(0.5f)
                    .fillMaxHeight()
            ) {
                CuadranteCard(
                    titulo = stringResource(id = R.string.row_composable_title),
                    texto=stringResource(id = R.string.row_composable_text),
                    badgroundColor=Color.Cyan
                )
            }
            Column(modifier = Modifier
                //.background(Color.LightGray)
                .fillMaxWidth()
                .fillMaxHeight()
            ) {
                CuadranteCard(
                    titulo = stringResource(id = R.string.column_composable_title),
                    texto=stringResource(id = R.string.column_composable_text),
                    badgroundColor=Color.LightGray
                )
            }
        }
    }
}

@Composable
private fun CuadranteCard(
    titulo:String="",
    texto:String = "",
    badgroundColor:Color = Color.Black
){
    Column(modifier = Modifier
        .background(badgroundColor)
        .padding(10.dp)
        //.border(1.dp, Color.Red)
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(titulo, fontWeight = FontWeight.Bold
        )
        Text(texto,textAlign = TextAlign.Justify,
            modifier = Modifier.padding(top = 5.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CuadranteComposableTheme {
        Surface() {
            Cuadrante()
        }
    }
}