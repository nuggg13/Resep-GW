package com.example.resepmakan

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail)

        // Inisialisasi View
        val btnBack: ImageView = findViewById(R.id.btnBack)
        val gambarSayur: ImageView = findViewById(R.id.gambarSayur)
        val namaSayur: TextView = findViewById(R.id.namaSayur)
        val deskripsiSayur: TextView = findViewById(R.id.deskripsiSayur)

        // Mendapatkan data dari Intent
        val nama = intent.getStringExtra("nama")
        val deskripsi = intent.getStringExtra("deskripsi")
        val idGambar = intent.getIntExtra("idGambar", 0)

        // Mengatur aksi tombol kembali
        btnBack.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        // Mengatur data ke tampilan
        gambarSayur.setImageResource(idGambar)
        namaSayur.text = nama
        deskripsiSayur.text = deskripsi
    }
}
