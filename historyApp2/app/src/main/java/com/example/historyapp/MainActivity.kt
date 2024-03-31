package com.example.historyapp


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    //Declare Variables

    private lateinit var ageInput: EditText
    private lateinit var generateButton: Button
    private lateinit var clearButton: Button
    private lateinit var resultTextView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        //Initialize

        ageInput = findViewById(R.id.ageInput)
        generateButton = findViewById<Button>(R.id.generateButton)
        clearButton = findViewById<Button>(R.id.clearButton)
        resultTextView = findViewById(R.id.resultTextView)

        generateButton.setOnClickListener {
            val age = ageInput.text.toString().toIntOrNull()

            if (age != null && age in 20..100) {
                val historicFigure = when (age) {

                    75 -> "Caesar Augustus who was the first Roman Emperor who began the construction of many famous Roman monuments."
                    32 -> "Srinivasa Ramanujan who was an Indian mathematician who made incredible advances in the field of mathematics."
                    88 -> "Charlie Chaplin who was a famous comic actor during the early 20th century of television in black and white."
                    79 -> "Immanuel Kant who was a philosopher who contributed great changes to the field in the late 18th century."
                    48 -> "Heinrich Cornelius Agrippa who was a polymath who is famous for his book on the occult. "
                    59 -> "Helena Blavatsky who was an occultist who shaped the way of thinking for many secret societies."
                    67 -> "George Washington who was the first President of the United States Of America."
                    51 -> "Napoleon Bonaparte who was the man to take France forward into a new age after the French Revolution."
                    82 -> "Pele who was a football player considered by many to be the greatest of all time."
                    81 -> "Queen Victoria who was considered one of the greatest rulers of the United Kingdom"

                    else -> null

                }
                val message = if (historicFigure != null) "You are the age of $historicFigure."
                else "No Historical Figure was found within the entered age."
                resultTextView.text = message


            } else {
                resultTextView.text = "Incorrect input. Please enter a valid age between 20 and 100."


            }
        }
        clearButton.setOnClickListener {
            ageInput.text.clear()
            resultTextView.text = ""

        }
    }

}


