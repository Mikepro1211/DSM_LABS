/*1- Solicitar al usuario 3 números enteros ,diferentes y múltiplos de 5 y calcular el mayor y menor de ellos.

   1- Para el número mayor se debe de sumar 10 ,  si el número menor es mayor a 10.
   1- 30 + 10 = 40
   2- 20
   3- 11
   Mayor = 40
   Menor = 11

   2- Para el número menor se debe de restar 5,  si el numero mayor es menor a 50
   1- 30 + 10 = 40
   2- 20
   3- 11 - 5
   Mayor = 40
   Menor = 6

   3- las impresiones de los resultados se realizan en pantalla,   consola.

--*/

fun main() {
    println("Ingrese primer digito")
    val num1 = readln()!!.toInt()
    println("Ingrese segundo digito")
    val num2 = readln()!!.toInt()
    println("Ingrese tercer digito")
    val num3 = readln()!!.toInt()

    if (num1 % 5 == 0 && num2 % 5 == 0 && num3 % 5 == 0) {
        println("Cumplen con la condicion multiplos de 5  ")

        if (num1 !== num2 && num2!==num1 &&num3!==num2 && num3!==num1 ) {
            println("Numero son diferentes")
            //verificacion que numero es mayor
            if (num1 > num2 && num1 > num3) {
                println("El mayor de los numeros $num1 que $num2 y que $num3")
                //suma si el tercer digito es mayor que 10
                if(num3>10){
                    println("Se efectua la suma debido a que $num3 es mayor a 10  ")
                    val  suma = num1+10

                    println("Resultado es $num1 + 10 es $suma  con $num2 y $num3")
                }else {
                    println("No se efecuta  la suma debido a que $num3 no es mayor que 10")
                }
                //verificacion si segundo numero es mayor que los demas
            } else if (num2 > num3 && num2 > num1) {
                println("El numero mayor es $num2 que $num1 y que $num3")
                if(num3>10){
                    println("Se efectua la suma debido a que $num3 es mayor a 10 ")
                    val  suma = num2+10

                    println("Resultado es $num2 + 10 es $suma  con $num1 y $num3")
                }else {
                    println("No se efecuta  la suma debido a que $num3 no es mayor que 10")
                }
                // verificacion si tercer digito es mayor que los demas s
            } else {
                println("Numero mayor es $num3 que $num1 y que $num2")
                if(num3>10){
                    println("Se efectua la suma debido a que $num3 es mayor a 10 ")
                    val  suma = num3+10

                    println("Resultado es $num3 + 10 es $suma  con $num1 y $num2")
                }else {
                    println("No se efecuta  la suma debido a que $num3 no es mayor que 10")
                }

            }
            println("*******************Verificacion de numero menor*******************")

            //verificacion de numero menor
            if(num1<num2 && num1<num3) {
                println("El numero menor es $num1 que $num2 y $num3")
                if (num3<50){
                    println("Se efectua resta de -5  ya que $num3 es menor que 50")
                    val resta =num1-5
                    println("Resultado $num1 - 5 es $resta queda con $num2 y $num3")
                }
            }else if(num2<num1 && num2<num3){
                println("El numero menor es $num2 que $num1 y $num3")
                if (num3<50){
                    println("Se efectua resta de -5  ya que $num3 es menor que 50")
                    val resta =num2-5
                    println("Resultado $num2 - 5 es $resta queda con $num1 y $num3")
                }
            }else {
                println("El numero menor es $num3 que $num1 y $num2")
                if (num3<50){
                    println("Se efectua resta de -5  ya que $num3 es menor que 50")
                    val resta =num3-5
                    println("Resultado $num3 - 5 es $resta queda con $num1 y $num2")
                }
            }

        } else {
            println("Numeros no son diferentes")
        }


        }else{
            println("Un numero no es multiplo 5")
        }
}
