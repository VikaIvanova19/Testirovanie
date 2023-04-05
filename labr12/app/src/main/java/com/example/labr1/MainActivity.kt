package com.example.labr1

import android.R
import android.app.ListActivity
import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.labr1.Argentina
import com.example.labr1.Brasilia
import com.example.labr1.Chili
import com.example.labr1.Columbia

class MainActivity : ListActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val countries = arrayOf("Аргентина", "Бразилия", "Чили", "Колумбия", "Уругвай")
        val mAdapter = ArrayAdapter(
            this,
            R.layout.simple_list_item_1, countries
        )
        listAdapter = mAdapter
        val itemclick =
            OnItemClickListener { adapterView, view, i, l ->
                when (i) {
                    0 -> {
                        val intent = Intent(this@MainActivity, Argentina::class.java)
                        Toast.makeText(applicationContext, "Флаг Аргентины", Toast.LENGTH_SHORT)
                            .show()
                        startActivity(intent)
                    }
                    1 -> {
                        val intent1 = Intent(this@MainActivity, Brasilia::class.java)
                        Toast.makeText(applicationContext, "Флаг Бразилии", Toast.LENGTH_SHORT)
                            .show()
                        startActivity(intent1)
                    }
                    2 -> {
                        val intent2 = Intent(this@MainActivity, Chili::class.java)
                        Toast.makeText(applicationContext, "Флаг Чили", Toast.LENGTH_SHORT).show()
                        startActivity(intent2)
                    }
                    3 -> {
                        val intent3 = Intent(this@MainActivity, Columbia::class.java)
                        Toast.makeText(applicationContext, "Флаг Колумбии", Toast.LENGTH_SHORT)
                            .show()
                        startActivity(intent3)
                    }
                    4 -> {
                        val intent4 = Intent(this@MainActivity, Urugvai::class.java)
                        Toast.makeText(applicationContext, "Флаг Уругвая", Toast.LENGTH_SHORT)
                            .show()
                        startActivity(intent4)
                    }
                }
            }
        listView.onItemClickListener = itemclick
    }
}