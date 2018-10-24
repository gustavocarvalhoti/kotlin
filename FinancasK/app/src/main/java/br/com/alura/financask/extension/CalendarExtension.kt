package br.com.alura.financask.extension

import java.text.SimpleDateFormat
import java.util.*

fun Calendar.ptBR(): String {
    val formatoBrasileiro = "dd/MM/yyyy"
    val format = SimpleDateFormat(formatoBrasileiro)
    val dataFormatada = format.format(this.time)
    return dataFormatada
}