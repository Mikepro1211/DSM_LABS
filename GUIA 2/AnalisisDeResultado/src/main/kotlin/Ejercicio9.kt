/*Hacer un programa que posea dentro de él 2 menús, teniendo el siguiente formato:
a) conversión de colones a dólares
b) conversión de millas a kms
c) conversión de grados Celsius a grados Fahrenheit
d) segundo menú
1. si es positivo o negativo
2. área de un triangulo
3. fin submenú
e) fin de menú
Seleccione una opción (a..e):*/


fun main() {
    println("a) conversion de colones a dolares")
    println("b) conversion de millas a kms")
    println("c) conversion de grados Celsius a grados Fahrenheit")
    println("d) segundo menú")
    println("e) Fin de menu")
    println("Ingrese opcion")
    val opcion = readln()
    val apple ="a"
    if(opcion == apple ){
        val menu =apple.toInt()
    }

    println("$opcion")

/*
    when {
        opcion == 97->{
            println("//////Bienvenido al convertidor de dolares/////")
            println("1.Desea convertir de dolar a color")
            println("2 desea convertir de colon a dolar")
             val convertidor = readln()!!.toInt()
            when {
                convertido == 1 ->{
                    println("De dolar a colon")
                    println("Ingrese la cantidad de dolares")
                     val dolar = readln()!!.toDouble()
                     val colon = 8.76f
                     val conversion =  (dolar*colon)/1
                    print("Conversion de $ $dolar a colon es $conversion")

                }
            }

        }
    }
*/
}