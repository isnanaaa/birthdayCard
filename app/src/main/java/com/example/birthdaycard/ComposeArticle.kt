package com.example.birthdaycard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthdaycard.ui.theme.BirthdayCardTheme

class ComposeArticle : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BirthdayCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    ArticleImg(
                        tittle = stringResource(R.string.tittle),
                        textone = stringResource(R.string.textone),
                        texttwo = stringResource(R.string.texttwo),
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun ArticleTxt(tittle: String, textone: String, texttwo: String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ){
        Image(
            painter = image,
            contentDescription = null
        )
        Text(
            text = tittle,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.Start)
        )
        Text(text = textone,
            textAlign = TextAlign.Justify,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
        )
        Text(text = texttwo,
            fontSize = 20.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)
        )
    }
}

@Composable
fun ArticleImg(tittle: String, textone: String, texttwo: String, modifier: Modifier){
    val image = painterResource(id = R.drawable.bg_compose_background)
    Box(modifier){
        Image(
            painter = image,
            contentDescription = null
        )
        ArticleTxt(tittle = tittle,
            textone = textone,
            texttwo = texttwo,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeArticlePreview() {
    BirthdayCardTheme {
        ArticleTxt(tittle = stringResource(R.string.tittle),
            textone = stringResource(R.string.textone),
            texttwo = stringResource(R.string.texttwo),
            modifier = Modifier)
    }
}
