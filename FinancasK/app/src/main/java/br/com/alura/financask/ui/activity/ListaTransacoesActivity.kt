package br.com.alura.financask.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import br.com.alura.financask.R

class ListaTransacoesActivity : AppCompatActivity() {

    // fun -> função
    // trabalha com orientação a objetos e programação funcional
    // não precisa definir o retorno
    // O retorno default é o Unit
    // Unit é a nossa classe void
    // savedInstanceState: nome da variavel
    // Bundle: tipo
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Declara o layout
        setContentView(R.layout.activity_lista_transacoes)
    }
}