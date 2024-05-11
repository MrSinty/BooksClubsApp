package com.example.booksclubsapp

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.example.booksclubsapp.databinding.ActivityProfileBinding
import com.google.android.material.navigation.NavigationView

class ProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding
    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        binding = ActivityProfileBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(R.layout.activity_profile)

        ViewCompat.setOnApplyWindowInsetsListener(binding.profileLayout) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //  third attempt
        drawerLayout = binding.profileLayout
        val toolbar = binding.toolbar
        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        val navView: NavigationView = binding.navigationDrawerView

        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setSupportActionBar(toolbar)

        navView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.nav_home -> Toast.makeText(applicationContext, "Home", Toast.LENGTH_SHORT)
                    .show()
            }
            true
        }

        //  second attempt
//        val navigationView = binding.navigationDrawerView
//        navigationView.setNavigationItemSelectedListener(this)
//
//        val toggle = ActionBarDrawerToggle(this@ProfileActivity, drawerLayout, R.string.open, R.string.close)
//        drawerLayout.addDrawerListener(toggle)
//        toggle.syncState()

//  first attempt
//        binding.apply {
//            toggle= ActionBarDrawerToggle(this@ProfileActivity, profileLayout, R.string.open, R.string.close)
//            profileLayout.addDrawerListener(toggle)
//            toggle.syncState()
//
//            supportActionBar?.setDisplayHomeAsUpEnabled(true)
//
//            navigationDrawerView.setNavigationItemSelectedListener {
//                when(it.itemId){
//                    R.id.nav_home->{
//                        Toast.makeText(this@ProfileActivity, "home", Toast.LENGTH_SHORT).show()
//                        }
//                    R.id.nav_profile->{
//                        Toast.makeText(this@ProfileActivity, "profile", Toast.LENGTH_SHORT).show()
//                    }
//                    R.id.nav_settings->{
//                        Toast.makeText(this@ProfileActivity, "settings", Toast.LENGTH_SHORT).show()
//                    }
//                }
//                true
//            }
//        }

    }

    //  third attempt
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    //  second attempt
//    override fun onNavigationItemSelected(item: MenuItem): Boolean {
//        when (item.itemId) {
//            R.id.nav_profile -> {
//                Toast.makeText(this, "profile", Toast.LENGTH_SHORT).show()
//            }
//            R.id.nav_home -> {
//                Toast.makeText(this, "home", Toast.LENGTH_SHORT).show()
//            }
//            R.id.nav_settings -> {
//                Toast.makeText(this, "settings", Toast.LENGTH_SHORT).show()
//            }
//        }
//        drawerLayout.closeDrawer(GravityCompat.START)
//        return true
//    }
//
//    override fun onBackPressed() {
//        super.onBackPressed()
//        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
//            drawerLayout.closeDrawer(GravityCompat.START)
//        } else {
//            onBackPressedDispatcher.onBackPressed()
//        }
//    }


//  first attempt
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        if (toggle.onOptionsItemSelected(item)){
//            true
//        }
//        return super.onOptionsItemSelected(item)
//    }
}