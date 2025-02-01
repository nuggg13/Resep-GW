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

        // Fungsi untuk mengarahkan ke activity detail makanan
        btnBakso.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("nama", "Bakso")
            intent.putExtra("deskripsi", getString(R.string.deskripsi_bakso))
            intent.putExtra("idGambar", R.drawable.bakso)
            intent.putExtra("alatBahan", "• Daging sapi cincang\n• Tepung tapioka\n• Bawang putih\n• Lada\n• Garam\n• Air")
            intent.putExtra("caraMemasak", "1. Campur daging sapi dengan tepung.\n2. Bentuk adonan menjadi bulatan.\n3. Rebus bakso hingga matang.\n4. Sajikan dengan kuah hangat.")

            startActivity(intent)
        }

        btnAyam.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("nama", "Ayam Penyet")
            intent.putExtra("deskripsi", getString(R.string.deskripsi_ayam))
            intent.putExtra("idGambar", R.drawable.ayam)
            intent.putExtra("alatBahan", "• Ayam\n• Bawang putih\n• Kunyit\n• Garam\n• Minyak goreng")
            intent.putExtra("caraMemasak", "1. Lumuri ayam dengan bumbu.\n2. Goreng ayam hingga matang.\n3. Penyet ayam dengan sambal.\n4. Sajikan dengan nasi.")

            startActivity(intent)
        }

        btnLele.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("nama", "Lele Goreng")
            intent.putExtra("deskripsi", getString(R.string.deskripsi_lele))
            intent.putExtra("idGambar", R.drawable.lele)
            intent.putExtra("alatBahan", "• Ikan lele\n• Jeruk nipis\n• Bawang putih\n• Garam\n• Minyak goreng")
            intent.putExtra("caraMemasak", "1. Bersihkan lele dan beri bumbu.\n2. Diamkan selama 15 menit.\n3. Goreng lele hingga kecoklatan.\n4. Sajikan dengan sambal.")

            startActivity(intent)
        }

        btnMie.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("nama", "Mie Ayam")
            intent.putExtra("deskripsi", getString(R.string.deskripsi_mie))
            intent.putExtra("idGambar", R.drawable.mie)
            intent.putExtra("alatBahan", "• Mie kuning\n• Ayam cincang\n• Bawang putih\n• Kecap manis\n• Daun bawang")
            intent.putExtra("caraMemasak", "1. Rebus mie hingga matang.\n2. Tumis bawang putih dan ayam.\n3. Tambahkan kecap manis dan bumbu.\n4. Sajikan mie dengan ayam.")

            startActivity(intent)
        }

        btnNasi.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("nama", "Nasi Goreng")
            intent.putExtra("deskripsi", getString(R.string.deskripsi_nasi))
            intent.putExtra("idGambar", R.drawable.nasi)
            intent.putExtra("alatBahan", "• Nasi putih\n• Telur\n• Kecap manis\n• Bawang merah\n• Bawang putih\n• Garam\n• Minyak goreng")
            intent.putExtra("caraMemasak", "1. Tumis bawang merah dan bawang putih.\n2. Masukkan telur dan aduk rata.\n3. Tambahkan nasi dan kecap.\n4. Aduk rata dan sajikan.")

            startActivity(intent)
        }
    }
}
