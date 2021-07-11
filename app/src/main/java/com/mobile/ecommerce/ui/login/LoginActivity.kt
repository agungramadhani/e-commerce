package com.mobile.ecommerce.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mobile.ecommerce.R
import com.mobile.ecommerce.databinding.ActivityLoginBinding
import com.mobile.ecommerce.databinding.ActivityMainBinding
import com.mobile.ecommerce.ui.home.MainActivity

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnSignIn.setOnClickListener{
            startActivity(
                Intent(this@LoginActivity, MainActivity::class.java)
            )
        }
    }
}