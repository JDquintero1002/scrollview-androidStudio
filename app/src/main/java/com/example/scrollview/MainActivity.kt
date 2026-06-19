package com.example.scrollview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.net.Uri
import com.example.scrollview.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnLlamar.setOnClickListener {

            val intent = Intent(
                Intent.ACTION_DIAL,
                Uri.parse("tel:3024480903")
            )

            startActivity(intent) //ejecuta la accion


        }


        binding.btnWeb.setOnClickListener {

            val intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=xOl-46Nodw0&list=RDxOl-46Nodw0&start_radio=1")
            )

            startActivity(intent)


        }


        binding.btnCorreo.setOnClickListener {

            val intent = Intent(Intent.ACTION_SENDTO,
                Uri.parse("mailto:riveracjhonf@gmail.com")
            )

            startActivity(intent)


        }


        binding.btnCompartir.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)

            intent.type = "text/plain"


            intent.putExtra(
                Intent.EXTRA_TEXT, "Hola, soy estudiante de desarrollo de software del SENA.")


            startActivity(Intent.createChooser(intent, "Compartir con:"))


        }

    }


}