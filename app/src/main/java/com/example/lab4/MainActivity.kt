


// Students:  Ahmad Younis and Abdulaziz Al-Kandari Collaberated with: Feras El Sabaa & Ali Kasem

package com.example.lab4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

// import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //        lateinit var nprints: EditText
    var x= 0.19
    var y= 0.49
    var z= 0.79

    var radioGroup: RadioGroup? = null
    lateinit var radioButton: RadioButton
    private lateinit var button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.textView2)
        // Display name of the Application
        // title = "RadioGroup in Kotlin"

        // Assigning id of RadioGroup
        radioGroup = findViewById(R.id.radioGroup)
        var nprints = findViewById<EditText>(R.id.nprints)
      // var rb1= findViewById<>()

        // Assigning id of Submit button
        button = findViewById(R.id.button)

        // Actions to be performed
        // when Submit button is clicked
        button.setOnClickListener {

            // Getting the checked radio button id
            // from the radio group
            val selectedOption: Int = radioGroup!!.checkedRadioButtonId
//                var ans  = null
// Assigning id of the checked radio button
          //  radioButton = findViewById(selectedOption)


//
          if (selectedOption.toString().equals("2131231013"))
          {
                var ans = x * (nprints.text.toString().toInt())
              textView.setText("The order cost is $ $ans")

            } else if (selectedOption.toString().equals("2131231014")){
                var ans = y * nprints.text.toString().toInt()
                textView.setText("The order cost is $ $ans")
//                             var ans =  nprints.text.toString().toInt()
            } else if (selectedOption.toString().equals("2131231015")){
                var ans = z * nprints.text.toString().toInt()
                textView.setText("The order cost is $ $ans")
         }
//                val answer






            // Displaying text of the checked radio button in the form of toast
 // Toast.makeText(this, selectedOption.toString()  , Toast.LENGTH_SHORT).show()

                }
    }
}
//2131231013
//2131165333
//2131165334