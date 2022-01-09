package com.dazz.androidbasickotlintemplates

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavHost
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navHost=supportFragmentManager.findFragmentById(R.id.frag_container)  as NavHostFragment
        val navController=navHost.navController
        setupActionBarWithNavController(navController)
    }
}