package com.example.jetsellbook.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.jetsellbook.components.ScrollEffectPager
import com.example.jetsellbook.viewmodel.MainViewModel

@Composable
fun CartScreen(viewModel: MainViewModel){
    val scrollState = rememberScrollState()
    LaunchedEffect(Unit, block = {
        viewModel.getBookList()
    })
    if (viewModel.errorMessage.isEmpty()) {
        Column(
            modifier = Modifier
                .padding(10.dp)
        ) {
            ScrollEffectPager()
            ListBookScreen(viewModel = viewModel)
            CategorySection()
            ListBookScreen(viewModel = viewModel)
            CategorySection()
            ListBookScreen(viewModel = viewModel)
        }
    } else {
        Text(viewModel.errorMessage)
    }
}

@Composable
fun ListBookInCart(){

}