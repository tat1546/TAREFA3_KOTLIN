package lambda

data class Frutas( var nome: String, var preco: Double)

fun main(args: Array<String>) {
    var frutas = arrayListOf(Frutas("Banana",1.50),Frutas("Moranga",3.20))

    for (fruta in frutas){
        println("${fruta.nome} - R$ ${fruta.preco}")
    }
}