package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setImage(findViewById(R.id.imageView))
        setImage(findViewById(R.id.imageView2))

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            // Toast the message
            Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        // Update the screen with the dice roll
        setImage(findViewById(R.id.imageView))
        setImage(findViewById(R.id.imageView2))
    }

    private fun setImage(view: ImageView) {
        when(Dice(6).roll()){
            1-> view.setImageResource(R.drawable.dice_1)
            2-> view.setImageResource(R.drawable.dice_2)
            3-> view.setImageResource(R.drawable.dice_3)
            4-> view.setImageResource(R.drawable.dice_4)
            5-> view.setImageResource(R.drawable.dice_5)
            6-> view.setImageResource(R.drawable.dice_6)
        }
    }

}

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}