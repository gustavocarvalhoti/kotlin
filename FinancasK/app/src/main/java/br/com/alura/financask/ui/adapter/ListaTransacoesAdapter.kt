package br.com.alura.financask.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import br.com.alura.financask.R
import br.com.alura.financask.model.Transacao
import kotlinx.android.synthetic.main.transacao_item.view.*
import java.text.SimpleDateFormat
import java.util.*

// Criando nosso adapter
// transacoes: List<String>) -> recebe parametros no construtor
class ListaTransacoesAdapter(transacoes: List<Transacao>, context: Context) : BaseAdapter() {

    private val transacoes = transacoes
    private val context = context

    override fun getView(posicao: Int, view: View?, parent: ViewGroup?): View {
        // Para criar uma tela
        val viewCriada = LayoutInflater.from(context).inflate(R.layout.transacao_item, parent, false)

        //Setando os valores
        val transacao = getItem(posicao)
        viewCriada.transacao_valor.setText(transacao.valor.toString())
        //viewCriada.transacao_data.setText(formataParaBrasileiro(transacao.data))
        viewCriada.transacao_data.setText(transacao.dataFormatoBrasileiro)
        viewCriada.transacao_categoria.setText(transacao.categoria)

        return viewCriada
    }

    // fun getDate(data: Calendar): String {
    // função nomeFunção(nomeAtributo: TipoAtributoQueRecebe) : TipoAtributoQueRetorna {
    /*
    fun formataParaBrasileiro(data: Calendar): String {
        val formatoBrasileiro = "dd/MM/yyyy"
        val format = SimpleDateFormat(formatoBrasileiro)
        val dataFormatada = format.format(data.time)
        return dataFormatada
    }
    */

    // Any - retorna qualquer coisa - override fun getItem(position: Int): Any {
    // Posso trocar por String
    override fun getItem(position: Int): Transacao {
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