package br.com.alura.financask.model

import java.math.BigDecimal
import java.text.SimpleDateFormat
import java.util.*

class Transacao(valor: BigDecimal, categoria: String, data: Calendar) {

    // Precisa ser inicializado = valor (Recebe um valor default)
    // private val valor = valor - Ele aceita assi tb
    val valor: BigDecimal = valor
    //private val categoria: String = categoria
    val categoria: String = categoria
    val data: Calendar = data
    val dataFormatoBrasileiro: String = data.formataParaBrasileiro()

    // No Kotlin não precisa desse \0/ - Ele vira uma "property"
    // Ele cria sozinho os gets e sets
    // val valor: BigDecimal = valor <- Só colocar assim
    /*
    fun getValor(): BigDecimal {
        return valor
    }
    */

    // Estou inserindo essa função na classe Calendar. que ZICA \0/
    fun Calendar.formataParaBrasileiro(): String {
        val formatoBrasileiro = "dd/MM/yyyy"
        val format = SimpleDateFormat(formatoBrasileiro)
        val dataFormatada = format.format(this.time)
        return dataFormatada
    }
}