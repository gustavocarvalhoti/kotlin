package br.com.alura.financask.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import br.com.alura.financask.R
import br.com.alura.financask.model.Tipo
import br.com.alura.financask.model.Transaction
import br.com.alura.financask.ui.adapter.ListaTransacoesAdapter
import kotlinx.android.synthetic.main.activity_lista_transacoes.*
import java.math.BigDecimal

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

        // var - cariavel mutavel
        // val - variavel imutavel
        // Para gravar em uma variavel não precisa setar o tipo - só se quiser \0/

        // Cria uma lista simples
        // val lista: List<String> = listOf("Comida - 20,00", "Ecomnomia - 100,00")
        // val transacoes = listOf("Comida - 20,00", "Ecomnomia - 100,00")

        // Abaixo ele nomeia as variaveis que serão setadas no contrutor, ai ele não depende da ordem
        val transacoes: List<Transaction> = criarTransacoesExemplo()

        // Instanciando o adapter
        // val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, transacoes)

        // Pega a lista do layout - Como era antes
        //findViewById<ListView>(R.id.lista_transacoes_listview)

        // No Kotlin \0/ utiliza o synthetic com base no Layout
        //lista_transacoes_listview.setAdapter(arrayAdapter)

        // OLD
        // lista_transacoes_listview.setAdapter(ListaTransacoesAdapter(transacoes, this))

        // NEW - Com prop
        configurarLista(transacoes)
    }

    private fun configurarLista(transacoes: List<Transaction>) {
        lista_transacoes_listview.adapter = ListaTransacoesAdapter(transacoes, this)
    }

    fun criarTransacoesExemplo(): List<Transaction> {
        return listOf(
            Transaction(valor = BigDecimal(20), tipo = Tipo.DESPESA, categoria = "Comida de fianal de semana"),
            Transaction(valor = BigDecimal(100), categoria = "Pagamento", tipo = Tipo.RECEITA),
            Transaction(valor = BigDecimal(20000), categoria = "Venda do carro", tipo = Tipo.RECEITA),
            Transaction(valor = BigDecimal(5500), categoria = "Venda da moto", tipo = Tipo.RECEITA),
            Transaction(valor = BigDecimal(500000), categoria = "Venda da casa", tipo = Tipo.RECEITA),
            Transaction(valor = BigDecimal(500000), categoria = "Venda da casa", tipo = Tipo.RECEITA),
            Transaction(valor = BigDecimal(500000), categoria = "Venda da casa", tipo = Tipo.RECEITA)
        )
    }
}