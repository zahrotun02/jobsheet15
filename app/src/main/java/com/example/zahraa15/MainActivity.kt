package com.example.zahraa15

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Aplikasi Berjalan", Toast.LENGTH_SHORT)

        val tombol = findViewById<Button>(R.id.tombolNama)

        tombol.setOnClickListener {
            Toast.makeText(this, "Zahrotun Niswah", Toast.LENGTH_SHORT).show()
        }

        val tombol2 = findViewById<Button>(R.id.tombolKelas)

        tombol2.setOnClickListener {
            Toast.makeText(this, "XI PPLG 1", Toast.LENGTH_SHORT).show()
        }

        val tombol3 = findViewById<Button>(R.id.tombolNIS)

        tombol3.setOnClickListener {
            Toast.makeText(this, "3038", Toast.LENGTH_SHORT).show()
        }
    }
}