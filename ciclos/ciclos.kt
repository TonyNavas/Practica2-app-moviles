fun main()
{
    for (i in 1..3) 
        {
     println(i)
    }
    for (i in 6 downTo 0 step 2) {
     println(i)
    }
    //Ejemplo de do while
    var numero:Int
    do {
        println("Introduce un numero entre 1 y 100")
        numero = readLine()!!.toInt()
    } while(numero !in 1..100)
    println("Que onda")
    //while
// while (true) {
//     println("Esto se imprimirá por un largo tiempo!")
// }

   
   
}