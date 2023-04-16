package fethi.hamdani.assignement2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_page)
        val message = intent.getStringExtra("message")
        val messageTextView: TextView = findViewById(R.id.tx3)
        messageTextView.text = message
    }
}