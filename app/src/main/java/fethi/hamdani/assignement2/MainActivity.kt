package fethi.hamdani.assignement2

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var button : Button
    lateinit var input : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent = Intent(this, SecondPage::class.java)
        button = findViewById<Button>(R.id.button1)
        input =  findViewById<Button>(R.id.editTextTextPersonName2)
        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                val message = input.text.toString()
                intent.putExtra("message", message)
                startActivity(intent)
            }

        })


    }




}