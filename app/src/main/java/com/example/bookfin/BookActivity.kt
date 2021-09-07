package com.example.bookfin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_book.*

class BookActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book)

        val book = intent.getSerializableExtra("producto") as Book

        nombre_pretamista.text = book.nombre_pretamista
        libro_prestado.text = book.nombre_libro
        autor_libro.text = book.autor
        prestamo.text = book.fecha_prestamo
        entrega.text = book.fecha_entrega
        numero_prestamista.text = book.numero_telefono


    }
}