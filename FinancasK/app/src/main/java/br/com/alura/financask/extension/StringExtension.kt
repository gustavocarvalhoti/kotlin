package br.com.alura.financask.extension

// Padronizando o tamanho maximo do texto
fun String.limite(limite: Int): String {
    if (this.length > 14) {
        val primeiroCaracter = 0
        // OLD
        // cateforiaFormatada = cateforiaFormatada.substring(0, 14) + "..."
        // NEW - Executa e imprime a String, virou JavaScript XD
        return "${this.substring(primeiroCaracter, limite)}..."
    }
    return this;
}