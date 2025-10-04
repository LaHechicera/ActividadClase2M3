package com.example.materialv.ui.theme

import android.service.autofill.OnClickAction
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(){

    //Creamos contenedor principal
    Surface (
        modifier = Modifier.fillMaxSize(), //modifier -> hace que lo que hare aqui en el contenedor se muestre en el contenedor principal
    ) {
        //Columna -> esta dentreoo del contenedor Surface
        Column (
            modifier = Modifier.fillMaxSize().padding(24.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            //Agregamos Tarjeta
            Card (
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(24.dp), //Los mismo que un border radius de CSS
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
            ){
                Column (
                    modifier = Modifier.padding(24.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ){
                    Text(
                        text = "Hola a todos con Material 3",
                        style = MaterialTheme.typography.titleLarge,
                        textAlign = TextAlign.Center

                        )
                    Text(
                        text = "Este es un subtitulo con M3",
                        style = MaterialTheme.typography.bodyMedium,
                        textAlign = TextAlign.Center

                        )
                    Button(
                        onClick =  {/*Accion del boton*/},
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(16.dp)
                    ) {
                        Text("Comenzar", style = MaterialTheme.typography.labelLarge)
                    }
                }
            }
            Text(
                text = "Tema Actualizado con éxito",
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}