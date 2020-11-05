fun main(){
    val pessoas = listOf(
            Pessoa("Fernando", 3200.0f),
            Pessoa("Alfredo", 6000.0f),
            Pessoa("Flávio", 5000.0f),
            Pessoa("Marcela", 2200.0f)
    )

    val menorSalario:Pessoa = menorSalario(pessoas)
    val maiorSalario:Pessoa =  maiorSalario(pessoas)

    println("O menor sálario é de ${menorSalario.name}, R$${menorSalario.salario}")
    println("O maior sálario é de ${maiorSalario.name}, R$${maiorSalario.salario}")

}

private fun maiorSalario(pessoas: List<Pessoa>): Pessoa {
    var maiorSalario = pessoas[0]
    for (pessoa in pessoas) {
        if (pessoa.salario > maiorSalario.salario) {
            maiorSalario = pessoa
        }
    }
    return maiorSalario
}

private fun menorSalario(pessoas: List<Pessoa>): Pessoa {
    var menorSalario = pessoas[0]
    for (pessoa in pessoas) {
        if (pessoa.salario < menorSalario.salario) {
            menorSalario = pessoa
        }
    }
    return menorSalario
}

data class Pessoa(val name:String, val salario:Float)