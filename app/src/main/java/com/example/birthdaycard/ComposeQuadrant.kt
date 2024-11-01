package com.example.birthdaycard

import android.os.Bundle
import android.os.PersistableBundle
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthdaycard.ui.theme.BirthdayCardTheme

class ComposeQuadrant : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayCardTheme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    ComposeQuadrantt(

                    )
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrantt(){
    Column (
        Modifier.fillMaxWidth()
    ){
        Row (Modifier.weight(1f)){
            ComposableCard(
                tittle = stringResource(R.string.txtcom),
                desc = stringResource(R.string.textcom),
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            ComposableCard(tittle = stringResource(R.string.imgcom),
                desc = stringResource(R.string.imagecom),
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)){
            ComposableCard(tittle = stringResource(R.string.rwcom),
                desc = stringResource(R.string.rowcom),
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
                )
            ComposableCard(tittle = stringResource(R.string.clmcom),
                desc = stringResource(R.string.columncom),
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
                )
        }
    }
}

@Composable
private fun ComposableCard(
    tittle: String,
    desc: String,
    backgroundColor:Color,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = tittle,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(text = desc,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeQuadrantPreview(){
    BirthdayCardTheme {
        ComposeQuadrantt()
    }
}