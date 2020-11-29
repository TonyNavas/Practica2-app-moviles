fun main()
{
//numeros
val int = 123
val long = 123456L
val double = 12.34
val float =  12.32F
val hexadecimal = 0xAB
val binary = 0b01010101

 println(" Entero $int, Entero largo $long, para coma flotante $double, para decimales $float, para hexadecimales $hexadecimal, y binario $binary")

//  booleanos
//  val x = 1
//  val y = 2
//  val z = 2
//  val esTrue = x < y && x < z
//  val otroTrue = x == y || y == z

//  println("$esTrue,$x, $y, $z \n $otroTrue $x, $y, $z ")

 // Ejemplo con char
//  val trueboolean = true
//  val falsebooleanm = false

//  val x = 1
//  val y = 2
//  val z = 2
//  val estrue2 = x < y && < z
//  val OtroTrue = x == y || y == $z

//  //char
//  val a = "hola" val ch1 = a.toCharArray()[0]
//  val string = "A" val char = string.single()
//  println(char)
//  fun CharSequence.toChar() = single()
//  val string = "A" val char = string.toChar()
//  println(char)
//  println(ch1)

 //cadenas
// val string = "string con \n una línea nueva"
// val rawString = """
//  raw string es útil para
//  cadenas con muchas líneas
//  """
//  println("$string, $rawString")

//conversion de int a float

//DE ENTERO A FLOAT
var ent = 10
var flotante = int.toFloat()
println("entero = $ent a float = $flotante")
//DE FLOAT A ENTERO
var flotante2 = 10.05
var ent2 = flotante2.toInt()
println("flotante = $flotante a entero = $ent2")
}