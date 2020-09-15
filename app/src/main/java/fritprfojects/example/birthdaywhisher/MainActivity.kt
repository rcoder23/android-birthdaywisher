package fritprfojects.example.birthdaywhisher

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val SPLASH_TIME_OUT = 3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createbirthdayButton.setOnClickListener {
            val name = nameInput.editableText.toString()
            val intent = Intent(this,BirthdayCreateActivity::class.java)
            intent.putExtra("name",name)
            startActivity(intent)
        }
    }
}

