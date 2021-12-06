package com.example.myreceycleview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.Menu




class MainActivity : AppCompatActivity() {

    private lateinit var rvKopi: RecyclerView
    private var list: ArrayList<Kopi> = arrayListOf()

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.profil, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {

        R.id.miProfile -> {
            val moveIntent = Intent(this@MainActivity, ProfileActivity::class.java)
            startActivity(moveIntent)
            true

        }

        else -> {
            // If we got here, the user's action was not recognized.
            // Invoke the superclass to handle it.
            super.onOptionsItemSelected(item)
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvKopi = findViewById(R.id.rv_kopi)
        rvKopi.setHasFixedSize(true)

        list.addAll(KopiData.listData)
        showRecyclerList()


    }

    private fun showRecyclerList() {
        rvKopi.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListKopiAdapter(list)
        rvKopi.adapter = listHeroAdapter    }


}