package bion.lima.livia.myfirstproject

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import bion.lima.livia.myfirstproject.databinding.ActivityMainBinding


class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setContentView(R.layout.activity_main)
//        val textView = findViewById<TextView>(R.id.textView)
//        val changeButton: Button = findViewById(R.id.changeButton)

        binding.changeButton.setOnClickListener() {
            binding.textView.text = "Oiii"
        }

//        changeButton.setOnClickListener(){
//            textView.text = "Oi, Lívia!"
//        }


        binding.calculatorButton.setOnClickListener { v ->
            val intent =
                Intent(
                    this@MainActivity,
                    CalculatorActivity::class.java
                )
            startActivity(intent)
        }
    }
}