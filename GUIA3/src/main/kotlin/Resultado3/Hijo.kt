package Resultado3
/*Declarar una clase llamada Hijos. Definir dentro de la misma un arreglo para almacenar las edades de 5
personas. Definir un método cargar donde se ingrese por teclado el arreglo de las edades y llame a otros
dos métodos que impriman la mayor edad y el promedio de edades.*/
class Hijo (var edades: IntArray = IntArray(5)) {
   var  mayorEdad = 0
    fun  datos (){
        for (i in 0..edades.size-1){
            println("Ingrese edad de hijo ${i+1}")
            edades[i] = readln()!!.toInt()
        }
    }

    fun mostrar(){
        println("La mayor edad es ${edades.maxOrNull()}")
    }

    fun promedio(){
        println("Promedio de edades es de ${edades.average()}")
    }

}