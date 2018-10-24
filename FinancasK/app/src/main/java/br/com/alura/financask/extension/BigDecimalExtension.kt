package br.com.alura.financask.extension

import java.math.BigDecimal
import java.text.DecimalFormat
import java.util.*

// Extenção para bigdecimal
fun BigDecimal.ptBR(): String {
    // Setando a moeda no formato ptBR
    val formatPTBR = DecimalFormat.getCurrencyInstance(Locale("pt", "br"))
    return formatPTBR.format(this).replace("R$", "R$ ")
}