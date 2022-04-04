package br.com.felipersumiya.listahardwarerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.felipersumiya.listahardwarerecyclerview.adapter.AdapterProduto
import br.com.felipersumiya.listahardwarerecyclerview.model.Produto

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView_lista_produtos)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        // Configurar adapter
        val listaProdutos : MutableList<Produto> = mutableListOf()
        val adapterProduto = AdapterProduto(this,listaProdutos)

        recyclerView.adapter = adapterProduto

        //Adiciona os itens
        val produto1 = Produto(
            R.drawable.ssd,
            "SSD Sandisk 480GB",
            "Confiável, rápido e muita capacidade.",
            "R$ 450,00"
        )

        listaProdutos.add(produto1)

        val produto2 = Produto(
            R.drawable.processador,
            "Processador i5",
            "Processador Intel i5 de 10ªgeração.",
            "R$ 1050,00"
        )

        val produto3 = Produto(
            R.drawable.memoria,
            "Memória Ram Corsair 8GB DDR4",
            "Memória Corsair LPX 8GB, 2666MHZ",
            "R$ 369,00"
        )

        val produto4 = Produto(
            R.drawable.placadevideo,
            "GeForce RTX 3090 24gb",
            "Placa de vídeo incrível",
            "R$ 19.000"
        )

        val produto5 = Produto(
            R.drawable.teclado,
            "Teclado mecânico Gammer T-dagger Corvette",
            "Teclado com leds",
            "R$ 229,00"

        )

        val produto6 = Produto(
            R.drawable.gabinete,
            "Gabinte Gamer",
            "Gabinete ATX",
            "R$ 799,00"
        )

        listaProdutos.add(produto2)
        listaProdutos.add(produto3)
        listaProdutos.add(produto4)
        listaProdutos.add(produto5)
        listaProdutos.add(produto6)


    }
}