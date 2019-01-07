package com.example.saras.boardgamesdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val gamesList = arrayListOf("Chess", "Monopoly", "Scrabble")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        selectedGameBtn.setOnClickListener {
            val random = Random()
            val selectedGame = random.nextInt(gamesList.count())
            selectedGameTxt.text = gamesList[selectedGame]
        }
        addGameBtn.setOnClickListener {
            if(addGameTxt.text.count() > 0) {
                val newGame = addGameTxt.text.toString()
                gamesList.add(newGame)
                addGameTxt.text.clear()
            }
        }
    }
}
