package com.example.compose.middleexam.ui.index

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun Index(
    navController: NavHostController
){
    Column (
    ){
        Button(onClick = { navController.navigate("IndexPage") }) {
            Text(text = "Enter")
        }
    }
}