package bion.lima.livia.myfirstproject;

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import bion.lima.livia.myfirstproject.databinding.ActivityThirdBinding
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import bion.lima.livia.myfirstproject.databinding.ActivityMainBinding

class ThirdActivity: ComponentActivity() {
    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.i("TEST", "onCreate")

        binding.compare.setOnClickListener() {
            var value1 = binding.etanol.text.toString().toDoubleOrNull() ?: 0.0
            var value2 = binding.gasolina.text.toString().toDoubleOrNull() ?: 0.0
            var div:Double = value1 / value2

            if (div > 0.7 ){
                binding.resultado.text = "gasolina"
            }
            else{
                binding.resultado.text = "etanol"
            }
        }

    }

    override fun onStart(){
        super.onStart()

        Log.i("TEST", "onStart")
    }

    override fun onResume(){
        super.onResume()

        Log.i("TEST", "onResume")
    }

    override fun onStop(){
        super.onStop()

        Log.i("TEST", "onStop")
    }

    override fun onDestroy(){
        super.onDestroy()

        Log.i("TEST", "onDestroy")
    }

    override fun onPause(){
        super.onPause()

        Log.i("TEST", "onPause")
    }

}
