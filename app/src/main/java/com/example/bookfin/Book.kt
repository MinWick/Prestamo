package com.example.bookfin


import java.io.Serializable




class Book (val nombre_pretamista:String, val nombre_libro:String, val autor:String, val fecha_prestamo:String, val fecha_entrega:String, val numero_telefono:String ) : Serializable