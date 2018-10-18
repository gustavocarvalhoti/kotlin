package br.com.alura.financask.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import br.com.alura.financask.R

// Criando nosso adapter
// transacoes: List<String>) -> recebe parametros no construtor
class ListaTransacoesAdapter(transacoes: List<String>, context: Context) : BaseAdapter() {

    private val transacoes = transacoes
    private val context = context

    override fun getView(position: Int, view: View?, parent: ViewGroup?): View {
        // Para criar uma tela
        return LayoutInflater.from(context).inflate(R.layout.transacao_item, parent, false)
    }

    // Any - retorna qualquer coisa - override fun getItem(position: Int): Any {
    // Posso trocar por String
    override fun getItem(position: Int): String {
        // old - return transacoes.get(position)
        // new - return transacoes[position]
        return transacoes[position]
    }

    // Não temos ID ainda
    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return transacoes.size
    }
}