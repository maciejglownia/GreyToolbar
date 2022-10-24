package com.glownia.maciej.greytoolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.glownia.maciej.greytoolbar.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.companyIconToolbarNineDotsMenu.setOnClickListener { view ->
            Snackbar.make(view, "Nine dots menu clicked!", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        binding.companyIconToolbarCompanyIcon.setOnClickListener { view ->
            Snackbar.make(view, "Android icon clicked!", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        binding.companyIconToolbarMagnifier.setOnClickListener { view ->
            Snackbar.make(view, "Magnifier clicked!", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        binding.companyIconToolbarDoubleLeftArrows.setOnClickListener { view ->
            Snackbar.make(view, "Double left arrows clicked!", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }
}