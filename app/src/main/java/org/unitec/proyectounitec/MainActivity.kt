package org.unitec.proyectounitec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//El punto de partida de toda app es la MainActivity (Presenter)
class MainActivity : AppCompatActivity() {

    //fun en kotlin es una palabra reservada para implementar o crear una funcion o metodo
    //oncreate es el metodo
    //saved es el nombre que queremos
    //bundle es el tipo de dato
    //? es la creacion de la excepcion, garantiza que no haya un dato null en el modelo
    override fun onCreate(nombre: Bundle?) {
        super.onCreate(nombre)
        setContentView(R.layout.activity_main)
    }
}