package com.example.numguess2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    // Declare variables

    private lateinit var entNum: EditText
    private lateinit var DisplayMsg:TextView
    private lateinit var generateNum: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val randomNum = Random.nextInt(0,100)


        entNum = findViewById(R.id.entNum)
        DisplayMsg = findViewById(R.id.DisplayMsg)
        generateNum = findViewById(R.id.generateNum)

        generateNum.setOnClickListener {
            val numText = entNum.text.toString()

            if(numText.isNotEmpty()) {
                val num = numText.toInt()

                if(num == randomNum)     {
                    DisplayMsg.text = "Correct"

                } else if(num < randomNum) {
                    DisplayMsg.text =
                        "WRONG, Your answer is less than the number. Please try again"


                } else if(num > randomNum) {
                    DisplayMsg.text =
                        "WRONG, Your answer is greater than the number. Please try again"

                } else {
                    DisplayMsg.text = "Enter a number between 1 and 100"

                }
            }


        }








    }
}