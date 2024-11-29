package bion.lima.livia.myfirstproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.Button
import android.widget.TextView
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import bion.lima.livia.myfirstproject.databinding.ActivityMainBinding
import bion.lima.livia.myfirstproject.ui.theme.MyFirstProjectTheme

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setContentView(R.layout.activity_main)
//        val textView = findViewById<TextView>(R.id.textView)
//        val changeButton: Button = findViewById(R.id.changeButton)

        binding.unchangeButton.setOnClickListener(){
            binding.textView.text = "Oiii"
        }

//        changeButton.setOnClickListener(){
//            textView.text = "Oi, Lívia!"
//        }
    }
}
