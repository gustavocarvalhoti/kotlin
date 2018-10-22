package br.com.alura.financask.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import br.com.alura.financask.R
import br.com.alura.financask.model.Tipo
import br.com.alura.financask.model.Transaction
import br.com.alura.financask.ui.adapter.ListaTransacoesAdapter
import kotlinx.android.synthetic.main.activity_lista_transacoes.*
import java.math.BigDecimal
import java.util.*

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

        // Cria uma lista simples
        // var - cariavel mutavel
        // val - variavel imutavel
        // Para gravar em uma variavel não precisa setar o tipo - só se quiser \0/
        // val lista: List<String> = listOf("Comida - 20,00", "Ecomnomia - 100,00")
        //val transacoes = listOf("Comida - 20,00", "Ecomnomia - 100,00")


        val transacoes = listOf(
            Transaction(valor = BigDecimal(20), categoria = "Comida", tipo = Tipo.DESPESA),
            Transaction(valor = BigDecimal(100), categoria = "Economia", tipo = Tipo.RECEITA)
        )

        // Instanciando o adapter
        // val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, transacoes)

        // Pega a lista do layout - Como era antes
        //findViewById<ListView>(R.id.lista_transacoes_listview)

        // No Kotlin \0/ utiliza o synthetic com base no Layout
        //lista_transacoes_listview.setAdapter(arrayAdapter)

        lista_transacoes_listview.setAdapter(ListaTransacoesAdapter(transacoes, this))
    }
}