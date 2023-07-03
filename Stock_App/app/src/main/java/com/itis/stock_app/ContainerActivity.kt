package com.itis.stock_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class ContainerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_container)

        val controller =
            (supportFragmentManager.findFragmentById(R.id.container) as NavHostFragment)
                .navController

        findViewById<BottomNavigationView>(R.id.bnvMain).apply {
            setupWithNavController(controller)

        }
    }
}