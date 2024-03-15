package lambda

fun main (args: Array<String>){
    println("Digite o primeiro numero: ")
    val X = readLine()!!.toInt()
    //NullpointerException

    println("Digite o segundo número: ")
    val Y = readLine()!!.toInt()

    val resultado = multiplica(X,Y)
    println("O resultado da multiplicação é =$resultado")
}
fun multiplica(X:Int, Y:Int): Int{
    return X * Y
}