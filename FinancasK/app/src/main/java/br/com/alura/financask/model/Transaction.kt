package br.com.alura.financask.model

import java.math.BigDecimal
import java.text.SimpleDateFormat
import java.util.*

// Na parte de cima ele recebe essas variaveis no construtor
// Seta o valor default -> val data: Calendar = Calendar.getInstance()
// Quando seta o defaul não precisa passar ele no construtor
class Transaction(
    val valor: BigDecimal,
    val tipo: Tipo,
    val categoria: String = "Indefinido",
    val data: Calendar = Calendar.getInstance()
) {

    // Gets e Sets
    val dataPTBR: String = data.PTBR()

    fun Calendar.PTBR(): String {
        val formatoBrasileiro = "dd/MM/yyyy"
        val format = SimpleDateFormat(formatoBrasileiro)
        val dataFormatada = format.format(this.time)
        return dataFormatada
    }

    // OLD
    // Sobrecarga de construtor, ele olha para o principal e nos da essa nova opção
    //constructor(valor: BigDecimal, tipo: Tipo) : this(valor, "Indefinido", tipo)
    //constructor(valor: BigDecimal, tipo: Tipo, data: Calendar) : this(valor, "Indefinido", tipo, data)

    // NEW - Se indicar o valor não precisa disso \0/
    /*
    val transacoes = listOf(
        Transaction(valor = BigDecimal(20), categoria = "Comida", tipo = Tipo.DESPESA),
        Transaction(valor = BigDecimal(100), categoria = "Economia", tipo = Tipo.RECEITA)
    )
    */
}