fun main() {
    val maisBarato = maisBarato(mountarCarros())

    print("O carro mais barato é ${maisBarato.nome} e custa ${maisBarato.preco}")
}

private fun maisBarato(carros: List<Carro>): Carro {
    var maisBarato = carros[0]
    for (carro in carros) {
        if (carro.preco < maisBarato.preco)
            maisBarato = carro
    }
    return maisBarato
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
