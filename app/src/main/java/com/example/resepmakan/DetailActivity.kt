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
        val gambarMakanan: ImageView = findViewById(R.id.imageViewMakanan)
        val namaMakanan: TextView = findViewById(R.id.textViewNamaMakanan)
        val alatBahan: TextView = findViewById(R.id.textViewAlatBahan)
        val caraMemasak: TextView = findViewById(R.id.textViewCaraMemasak)

        // Mendapatkan data dari Intent
        val nama = intent.getStringExtra("nama")
        val idGambar = intent.getIntExtra("idGambar", 0)
        val bahan = intent.getStringExtra("alatBahan") ?: "Tidak tersedia"
        val cara = intent.getStringExtra("caraMemasak") ?: "Tidak tersedia"

        // Mengatur aksi tombol kembali
        btnBack.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        // Menampilkan data di tampilan
        gambarMakanan.setImageResource(idGambar)
        namaMakanan.text = nama
        alatBahan.text = bahan
        caraMemasak.text = cara
    }
}
