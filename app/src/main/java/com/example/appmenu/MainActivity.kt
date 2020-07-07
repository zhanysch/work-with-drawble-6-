package com.example.appmenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var present: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        present = findViewById(R.id.present)
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {               /// <--для того чтобы menux xml появилось в main activity
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    /// R.id.app -> present?.text = getString(R.string.app)
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {

            R.id.app -> { present?.text = getString(R.string.app)}

            R.id.service -> {
                this.startActivity(Intent(this, Service::class.java)) /// перенаправляем на следующую активность услугу ак
                Toast.makeText(this, "Вы выбрали раздел услуги", Toast.LENGTH_LONG).show()
                return true

            }


            R.id.product -> {
                this.startActivity(Intent(this, product::class.java))  //// перенаправляю на следующую активность товары
                Toast.makeText(this, "Вы выбрали товар", Toast.LENGTH_LONG).show()
                return true


            }
            else -> super.onOptionsItemSelected(item)

        }



        return super.onOptionsItemSelected(item)
    }

}


