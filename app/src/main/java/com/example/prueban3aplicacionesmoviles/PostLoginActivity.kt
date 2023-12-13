package com.example.prueban3aplicacionesmoviles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.prueban3aplicacionesmoviles.databinding.ActivityMainBinding
import com.example.prueban3aplicacionesmoviles.databinding.ActivityPostLoginBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth

class PostLoginActivity : AppCompatActivity() {

    //ViewBinding
    private lateinit var binding : ActivityPostLoginBinding
    //Fireabse auth
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPostLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Inicializar firebase
        auth = Firebase.auth

        //Buscar btn para cerrar sesión
        binding.btnLogout.setOnClickListener {
            MaterialAlertDialogBuilder(this)
                .setTitle("¿Quieres salir?")
                .setMessage("Si precionas 'Cerrar sesión', saldras de la aplicación")
                .setNeutralButton("Cancelar") { dialog, which ->

                }
                .setPositiveButton("Cerrar sesión") { dialog, which ->

                    auth.signOut()
                    finish()
                }
                .show()


        }

        }




    }
