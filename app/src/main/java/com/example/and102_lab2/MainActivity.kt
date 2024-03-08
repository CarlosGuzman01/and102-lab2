package com.example.and102_lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var emails: List<Email>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerView = findViewById<RecyclerView>(R.id.emailRv)

        val list = EmailFetcher.getEmails()

        val emailAdapter = EmailAdapter(list)

        recyclerView.adapter = emailAdapter

        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}