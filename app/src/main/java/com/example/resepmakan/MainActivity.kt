package com.example.resepmakan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Deklarasi tombol Lihat Detail
        val btnBakso: Button = findViewById(R.id.btnBakso)
        val btnAyam: Button = findViewById(R.id.btnAyam)
        val btnLele: Button = findViewById(R.id.btnLele)
        val btnMie: Button = findViewById(R.id.btnMie)
        val btnNasi: Button = findViewById(R.id.btnNasi)

        // Fungsi untuk mengarahkan ke activity detail sayur
        btnBakso.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("nama", "Kentang")
            intent.putExtra("deskripsi", getString(R.string.deskripsi_bakso))
            intent.putExtra("idGambar", R.drawable.bakso)

            startActivity(intent)
        }

        btnAyam.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("nama", "Ayam Penyet")
            intent.putExtra("deskripsi", getString(R.string.deskripsi_ayam))
            intent.putExtra("idGambar", R.drawable.ayam)

            startActivity(intent)
        }

        btnLele.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("nama", "Lele Goreng")
            intent.putExtra("deskripsi", getString(R.string.deskripsi_lele))
            intent.putExtra("idGambar", R.drawable.lele)

            startActivity(intent)
        }

        btnMie.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("nama", "Mie Ayam")
            intent.putExtra("deskripsi", getString(R.string.deskripsi_mie))
            intent.putExtra("idGambar", R.drawable.mie)

            startActivity(intent)
        }

        btnNasi.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("nama", "Nasi goreng")
            intent.putExtra("deskripsi", getString(R.string.deskripsi_nasi))
            intent.putExtra("idGambar", R.drawable.nasi)

            startActivity(intent)
        }
    }
}
