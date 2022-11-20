package com.example.kakali

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity(), View.OnClickListener {
    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var button4: Button
    private lateinit var button5: Button
    private lateinit var button6: Button
    private lateinit var button7: Button
    private lateinit var button8: Button
    private lateinit var button9: Button
    private lateinit var reset: Button
    private lateinit var first: TextView
    private lateinit var second: TextView
    private lateinit var score1: TextView
    private lateinit var score2: TextView

    var activePlayer = 1

    private var firstPlayer = ArrayList<Int>()
    private var secondPlayer = ArrayList<Int>()
    private var score:  MutableList<Int> = mutableListOf(0)
    private var score10:  MutableList<Int> = mutableListOf(0)




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val player1 = intent.extras?.getString("player1","misha")
        val player2 = intent.extras?.getString("player2", "nodari")
        init()
        first = findViewById(R.id.first)
        second = findViewById(R.id.second)
        first.text = player1
        second.text = player2
        score1 = findViewById(R.id.score1)
        score2 = findViewById(R.id.score2)

    }

    private fun init() {
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)
        button5 = findViewById(R.id.button5)
        button6 = findViewById(R.id.button6)
        button7 = findViewById(R.id.button7)
        button8 = findViewById(R.id.button8)
        button9 = findViewById(R.id.button9)
        reset = findViewById(R.id.reset)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
        button6.setOnClickListener(this)
        button7.setOnClickListener(this)
        button8.setOnClickListener(this)
        button9.setOnClickListener(this)
        reset.setOnClickListener(this)

    }

    override fun onClick(clickedView: View?) {

        if (clickedView is Button) {

            var buttonNumber = 0

            when (clickedView.id) {
                R.id.button1 -> buttonNumber = 1
                R.id.button2 -> buttonNumber = 2
                R.id.button3 -> buttonNumber = 3
                R.id.button4 -> buttonNumber = 4
                R.id.button5 -> buttonNumber = 5
                R.id.button6 -> buttonNumber = 6
                R.id.button7 -> buttonNumber = 7
                R.id.button8 -> buttonNumber = 8
                R.id.button9 -> buttonNumber = 9
                R.id.reset -> reset()

            }

            if (buttonNumber != 0) {
                playGame(buttonNumber, clickedView)
            }

        }

    }
    fun reset(){
        score.clear()
        score10.clear()
        score1.text = ""
        score2.text = ""
        ClearTable()


    }

    private fun playGame(buttonNumber: Int, clickedView: Button) {
        if (activePlayer == 1) {
            clickedView.text = "X"
            clickedView.setBackgroundColor(Color.GREEN)
            activePlayer = 2
            firstPlayer.add(buttonNumber)
        } else if (activePlayer == 2) {
            clickedView.text = "0"
            clickedView.setBackgroundColor(Color.RED)
            activePlayer = 1
            secondPlayer.add(buttonNumber)
        }

        clickedView.isEnabled = false
        check()

    }
    fun buttonenable(){
        button1.isEnabled = true
        button2.isEnabled = true
        button3.isEnabled = true
        button4.isEnabled = true
        button5.isEnabled = true
        button6.isEnabled = true
        button7.isEnabled = true
        button8.isEnabled = true
        button9.isEnabled = true

    }
    fun ClearTable(){
        button1.setBackgroundColor(Color.BLUE)
        button1.text = ""
        button2.setBackgroundColor(Color.BLUE)
        button2.text = ""
        button3.setBackgroundColor(Color.BLUE)
        button3.text = ""
        button4.setBackgroundColor(Color.BLUE)
        button4.text = ""
        button5.setBackgroundColor(Color.BLUE)
        button5.text = ""
        button6.setBackgroundColor(Color.BLUE)
        button6.text = ""
        button7.setBackgroundColor(Color.BLUE)
        button7.text = ""
        button8.setBackgroundColor(Color.BLUE)
        button8.text = ""
        button9.setBackgroundColor(Color.BLUE)
        button9.text = ""
        firstPlayer.clear()
        secondPlayer.clear()
        buttonenable()




    }

    private fun check() {

        var winnerPlayer = 0

        if (firstPlayer.contains(1) && firstPlayer.contains(2) && firstPlayer.contains(3)) {
            winnerPlayer = 1
        }
        if (secondPlayer.contains(1) && secondPlayer.contains(2) && secondPlayer.contains(3)) {
            winnerPlayer = 2
        }
        if (firstPlayer.contains(4) && firstPlayer.contains(5) && firstPlayer.contains(6)) {
            winnerPlayer = 1
        }
        if (secondPlayer.contains(4) && secondPlayer.contains(5) && secondPlayer.contains(6)) {
            winnerPlayer = 2
        }
        if (firstPlayer.contains(7) && firstPlayer.contains(8) && firstPlayer.contains(9)) {
            winnerPlayer = 1
        }
        if (secondPlayer.contains(7) && secondPlayer.contains(8) && secondPlayer.contains(9)) {
            winnerPlayer = 2
        }
        if (firstPlayer.contains(1) && firstPlayer.contains(4) && firstPlayer.contains(7)) {
            winnerPlayer = 1
        }
        if (secondPlayer.contains(1) && secondPlayer.contains(4) && secondPlayer.contains(7)) {
            winnerPlayer = 2
        }
        if (firstPlayer.contains(2) && firstPlayer.contains(5) && firstPlayer.contains(8)) {
            winnerPlayer = 1
        }
        if (secondPlayer.contains(2) && secondPlayer.contains(5) && secondPlayer.contains(8)) {
            winnerPlayer = 2
        }
        if (firstPlayer.contains(3) && firstPlayer.contains(6) && firstPlayer.contains(9)) {
            winnerPlayer = 1
        }
        if (secondPlayer.contains(3) && secondPlayer.contains(6) && secondPlayer.contains(9)) {
            winnerPlayer = 2
        }
        if (firstPlayer.contains(1) && firstPlayer.contains(5) && firstPlayer.contains(9)) {
            winnerPlayer = 1
        }
        if (secondPlayer.contains(1) && secondPlayer.contains(5) && secondPlayer.contains(9)) {
            winnerPlayer = 2
        }
        if (firstPlayer.contains(3) && firstPlayer.contains(5) && firstPlayer.contains(7)) {
            winnerPlayer = 1
        }
        if (secondPlayer.contains(3) && secondPlayer.contains(5) && secondPlayer.contains(7)) {
            winnerPlayer = 2
        }

        if (winnerPlayer == 1) {
            ClearTable()
            score[0]++
            score1.text = score[0].toString()
            Toast.makeText(this, "${first.text} is winner", Toast.LENGTH_SHORT).show()
        } else if (winnerPlayer == 2) {
            score10[0]++
            score2.text = score10[0].toString()
            ClearTable()
            Toast.makeText(this, "${second.text} is winner", Toast.LENGTH_SHORT).show()

        }  else if  ((firstPlayer.size + secondPlayer.size == 9) && (winnerPlayer == 0)) {
            ClearTable()
            Toast.makeText(this, "There is no winner", Toast.LENGTH_LONG).show()


        }




    }



}
