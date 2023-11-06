package com.example.secondnavcomp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.example.secondnavcomp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)

    }

    override fun onResume() {
        super.onResume()
        val navController = findNavController(R.id.fragment_Host)
        NavigationUI.setupActionBarWithNavController(this, navController)

        binding.bottomNavigationView.setupWithNavController(navController)

    }

    override fun onSupportNavigateUp(): Boolean {
        val navController =findNavController(R.id.fragment_Host)
        navController.navigateUp()
        return true
    }
}