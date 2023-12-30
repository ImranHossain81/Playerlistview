package com.example.playearlist_job2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    private lateinit var listView: ListView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)

        val playerList:ArrayList<Player> = ArrayList<Player>()

        playerList.add(Player(R.drawable.hasan, "Soumya Sarkar", "He is good player"))
        playerList.add(Player(R.drawable.hasan, "Tanzim Hasan Sakib", "He is the bast player"))
        playerList.add(Player(R.drawable.hasan, "Mustafizur Rahman", "He is the player"))
        playerList.add(Player(R.drawable.hasan, "Fargana Hoque", "He is the player"))
        playerList.add(Player(R.drawable.hasan, "Nigar Sultana", "He is the player"))
        playerList.add(Player(R.drawable.hasan, "Lartino Martinaze", "He is the player"))


        val playerAdapter = PlayerAdapter(this, playerList)

        listView.adapter = playerAdapter

    }
}