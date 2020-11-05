fun main() {
    val maisBarato = maisBarato(mountarCarros())
    val maisCaro = maisCaro(mountarCarros())

    println("O carro mais barato é ${maisBarato.nome} e custa ${maisBarato.preco}")
    println("O carro mais barato é ${maisCaro.nome} e custa ${maisCaro.preco}")
}

private fun maisBarato(carros: List<Carro>): Carro {
    var maisBarato = carros[0]
    for (carro in carros) {
        if (carro.preco < maisBarato.preco)
            maisBarato = carro
    }
    return maisBarato
}

private fun maisCaro(carros: List<Carro>): Carro {
    var maisCaro = carros[0]
    for (carro in carros) {
        if (carro.preco > maisCaro.preco)
            maisCaro = carro
    }
    return maisCaro
}

fun mountarCarros(): List<Carro> {
    return listOf(
            Carro("Lamborghini", 1000000.0f),
            Carro("Jipe", 46000.0f),
            Carro("Brasilia", 16000.0f),
            Carro("Smart", 46000.0f),
            Carro("Fusca", 17000.0f)
    )
}

data class Carro(val nome: String, val preco: Float)
