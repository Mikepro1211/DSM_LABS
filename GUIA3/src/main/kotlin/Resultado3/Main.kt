package Resultado3

fun main() {
    var cont:String = "Y"
    do {
        var hijo = Hijo()
        hijo.datos()
        hijo.mostrar()
        hijo.promedio()

        println("¿Desea continuar? Y/N ")
        cont = readln()
    }while(cont=="y")
    println("Hasta Luego")
}