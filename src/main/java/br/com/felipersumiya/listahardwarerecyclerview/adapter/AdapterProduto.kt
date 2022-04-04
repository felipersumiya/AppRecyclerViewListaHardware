package br.com.felipersumiya.listahardwarerecyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.felipersumiya.listahardwarerecyclerview.R
import br.com.felipersumiya.listahardwarerecyclerview.model.Produto

class AdapterProduto(private val context:Context, private val listProdutos: MutableList<Produto>) : RecyclerView.Adapter<AdapterProduto.ProdutoViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {
        //Criar as visualizações para os itens de lista. Cria
        val itemLista = LayoutInflater.from(context).inflate(R.layout.hardware_item,parent,false)
        val holder = ProdutoViewHolder(itemLista)
        return holder

    }

    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {
        //Exibir as views. Exibe
        holder.fotoProduto.setImageResource(listProdutos[position].foto)// recupera a imagem
        holder.nomeProduto.text = listProdutos[position].nome
        holder.descricaoProduto.text = listProdutos[position].descricao
        holder.precoProduto.text = listProdutos[position].preco


    }

    override fun getItemCount(): Int {
        //Retorna a quantidade itens da lista de modelo de dados
        return listProdutos.size

    }


    inner class ProdutoViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        //Inicializar as variávies do XML
        val fotoProduto = itemView.findViewById<ImageView>(R.id.foto_produto)
        val nomeProduto = itemView.findViewById<TextView>(R.id.nome_produto)
        val descricaoProduto = itemView.findViewById<TextView>(R.id.descricao_produto)
        val precoProduto = itemView.findViewById<TextView>(R.id.preco_produto)

        fun bind(){

        }

    }

}