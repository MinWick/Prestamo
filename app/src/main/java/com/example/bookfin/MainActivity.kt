package com.example.bookfin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val book = Book("Camara", "Azul", "Ruben Dario", "12/05/08", "12/09/09", "89295347")
        val book2 = Book("PC", "Cantos de vida", "Gabriel", "11/07/05", "11/07/05", "76502107")

        val listBook = listOf(book,book2)
        val adapter = BookAdapter(this, listBook)

        list.adapter = adapter


        list.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, BookActivity::class.java)
            intent.putExtra("producto", listBook[position])
            startActivity(intent)
        }
    }
}