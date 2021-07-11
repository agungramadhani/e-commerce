package com.mobile.ecommerce.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mobile.ecommerce.R
import com.mobile.ecommerce.databinding.ActivitySplashBinding
import com.mobile.ecommerce.ui.login.LoginActivity

class SplashActivity : AppCompatActivity() {
    private lateinit var activitySplashBinding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySplashBinding.inflate(layoutInflater)
        activitySplashBinding = binding
        activitySplashBinding.imgLogo.alpha = 0f
        activitySplashBinding.imgLogo.animate().setDuration(3000).alpha(1f).withEndAction {
            val i = Intent(this, LoginActivity::class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }
        setContentView(binding.root)
    }
}