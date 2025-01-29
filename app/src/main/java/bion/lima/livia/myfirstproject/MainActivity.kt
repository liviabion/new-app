package bion.lima.livia.myfirstproject

import android.content.Intent
import android.os.Bundle
import android.util.Log
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
            intent.putExtra("data", "blah")
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()

        Log.i("TEST", "onStart")
    }

    override fun onResume() {
        super.onResume()

        Log.i("TEST", "onResume")
    }

    override fun onStop() {
        super.onStop()

        Log.i("TEST", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i("TEST", "onDestroy")
    }

    override fun onPause() {
        super.onPause()

        Log.i("TEST", "onPause")
    }
}