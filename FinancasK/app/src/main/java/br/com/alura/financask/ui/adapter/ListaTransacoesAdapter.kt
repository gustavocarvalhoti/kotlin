package br.com.alura.financask.ui.adapter

import android.content.Context
import android.support.v4.content.ContextCompat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import br.com.alura.financask.R
import br.com.alura.financask.extension.limite
import br.com.alura.financask.extension.ptBR
import br.com.alura.financask.model.Tipo
import br.com.alura.financask.model.Transaction
import kotlinx.android.synthetic.main.transacao_item.view.*

// Criando nosso adapter
// transacoes: List<String>) -> recebe parametros no construtor
class ListaTransacoesAdapter(transacoes: List<Transaction>, context: Context) : BaseAdapter() {

    private val transacoes = transacoes
    private val context = context
    private val limiteDaCategoria = 14

    override fun getView(posicao: Int, view: View?, parent: ViewGroup?): View {
        // Para criar uma tela
        val viewCriada = LayoutInflater.from(context).inflate(R.layout.transacao_item, parent, false)

        val transacao = getItem(posicao)
        // Setando os valores - old
        /*
        if (transacao.tipo == Tipo.RECEITA) {
            // Muda a cor
            viewCriada.transacao_valor.setTextColor(ContextCompat.getColor(context, R.color.receita))
            viewCriada.transacao_icone.setBackgroundResource(R.drawable.icone_transacao_item_receita)
        } else {
            viewCriada.transacao_valor.setTextColor(ContextCompat.getColor(context, R.color.despesa))
            viewCriada.transacao_icone.setBackgroundResource(R.drawable.icone_transacao_item_despesa)
        }
        */

        // Setando os valores - new
        viewCriada.transacao_valor.setTextColor(getCor(transacao.tipo))
        viewCriada.transacao_icone.setBackgroundResource(getIcone(transacao.tipo))

        viewCriada.transacao_valor.text = transacao.valor.ptBR()
        // viewCriada.transacao_valor.setText(transacao.valor.toString())

        // viewCriada.transacao_data.setText(ptBR(transacao.data))
        viewCriada.transacao_data.text = transacao.dataPTBR
        viewCriada.transacao_categoria.text = transacao.categoria.limite(limiteDaCategoria)

        return viewCriada
    }


    // fun getDate(data: Calendar): String {
    // função nomeFunção(nomeAtributo: TipoAtributoQueRecebe) : TipoAtributoQueRetorna {
    /*
    fun ptBR(data: Calendar): String {
        val ptBR = "dd/MM/yyyy"
        val format = SimpleDateFormat(ptBR)
        val dataFormatada = format.format(data.time)
        return dataFormatada
    }
    */

    // when expression - parecido com switch
    private fun getCor(tipo: Tipo): Int {
        return when (tipo) {
            Tipo.RECEITA -> ContextCompat.getColor(context, R.color.receita)
            Tipo.DESPESA -> ContextCompat.getColor(context, R.color.despesa)
        }
    }

    private fun getIcone(tipo: Tipo): Int {
        return when (tipo) {
            Tipo.RECEITA -> R.drawable.icone_transacao_item_receita
            Tipo.DESPESA -> R.drawable.icone_transacao_item_despesa
        }
    }

    // Any - retorna qualquer coisa - override fun getItem(position: Int): Any {
    // Posso trocar por String
    override fun getItem(position: Int): Transaction {
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