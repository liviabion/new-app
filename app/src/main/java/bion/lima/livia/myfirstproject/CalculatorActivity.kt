package bion.lima.livia.myfirstproject;

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import bion.lima.livia.myfirstproject.databinding.ActivityCalculatorBinding
import bion.lima.livia.myfirstproject.databinding.ActivityMainBinding

class CalculatorActivity : ComponentActivity() {

    private lateinit var binding: ActivityCalculatorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.soma.setOnClickListener() {
            var value1 = binding.primeiroNumero.text.toString().toDoubleOrNull() ?: 0.0
            var value2 = binding.segundoNumero.text.toString().toDoubleOrNull() ?: 0.0
            var soma:Double = value1 + value2
            binding.resultado.text = soma.toString()
        }

        binding.multiplicacao.setOnClickListener() {
            var value1 = binding.primeiroNumero.text.toString().toDoubleOrNull() ?: 0.0
            var value2 = binding.segundoNumero.text.toString().toDoubleOrNull() ?: 0.0
            var mult:Double = value1 * value2
            binding.resultado.text = mult.toString()
        }

        binding.subtracao.setOnClickListener() {
            var value1 = binding.primeiroNumero.text.toString().toDoubleOrNull() ?: 0.0
            var value2 = binding.segundoNumero.text.toString().toDoubleOrNull() ?: 0.0
            var sub:Double = value1 - value2
            binding.resultado.text = sub.toString()
        }

        binding.divisao.setOnClickListener() {
            var value1 = binding.primeiroNumero.text.toString().toDoubleOrNull() ?: 0.0
            var value2 = binding.segundoNumero.text.toString().toDoubleOrNull() ?: 0.0
            var div:Double = value1 / value2
            binding.resultado.text = div.toString()
        }

        Log.i("TEST", "onCreate")

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
