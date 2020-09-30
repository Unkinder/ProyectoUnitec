package org.unitec.proyectounitec

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.ejemplito.*


//El punto de partida de toda app es la MainActivity (Presenter)
class MainActivity : AppCompatActivity() {

    //fun en kotlin es una palabra reservada para implementar o crear una funcion o metodo
    //oncreate es el metodo
    //saved es el nombre que queremos
    //bundle es el tipo de dato
    //? es la creacion de la excepcion, garantiza que no haya un dato null en el modelo
    //hola que tal como estan, vamos a utilizar la funcio en github 
    override fun onCreate(nombre: Bundle?) {
        super.onCreate(nombre)

        setContentView(R.layout.ejemplito)

        //vamos a eliminar la barrita de la aprte superior del celular, esta barrita se conoce como supportationbar
        //suport es una clase
        //esta linea de codigo invoca un atributo (supportactionbar) y con el a su vez llamamos a su metodo hide() (sirve para ocultar ese objeto). el signo de ? es un operados de no-nulabilidad
        //cuando en kotlin se empeño a diseñar este lenguaje se vio que en java algunas ocaciones en los celulares tardaba mas en mostrarse la pantalla que en ejecutarse un codigo y en esos casos
        //
        //el compilador del celular se llama Dalvik (en java es la jvm)
        //Otra cosa hermosa de kotlin es que las sentencias NO TERMINAN EN ;


        supportActionBar?.hide()
        //Aqui vamos a introducir la primera parte de codigo de kotlin
        botoncito.setOnClickListener {
            //declaramos una variable de tipo Intent
            //int x;
           // var x = 5
          //  var z = x*2
            var i = Intent(this,ComandoVozActivity::class.java)
            // Lo invocamos
            startActivity(i)


        }

    }
}

