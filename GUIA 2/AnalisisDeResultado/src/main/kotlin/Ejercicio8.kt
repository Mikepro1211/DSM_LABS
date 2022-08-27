/*Se requiere calcular la edad de un individuo; para ello se va a tener como entrada dos fechas en el
formato día (1 a 31), mes (1 a 12) y un año (entero de cuatro dígitos), correspondientes a la fecha
de nacimiento y la fecha actual, respectivamente. Escriba un programa que calcule y muestre la edad
del individuo.
Si es la fecha de un bebé (menos de un año de edad), la edad se debe dar en meses y días; en caso
contrario, la edad se calculará en años.*/
fun main() {
    println("Bienvenido a Calcula tu edad")
    println("Ingrese dia de nacimiento")
    val dia = readln()!!.toInt()
    println("Ingrese mes de nacimiento")
    val mes = readln()!!.toInt()
    println("Ingrese año de nacimiento")
    val anio = readln()!!.toInt()

    if(dia <31 && mes<=12  ){
        println("Ingresar dia actual")
        val diaa = readln()!!.toInt()
        println("Ingrese mes actual")
        val mesa = readln()!!.toInt()
        println("Ingrese año actual")
        val anioa = readln()!!.toInt()

    }
    else {
        println("Asegurese de que dia no se mayor que 31 o mes mayor que 12")
    }
    val calculodia =

}