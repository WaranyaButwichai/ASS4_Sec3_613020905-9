package com.example.ass4_sec3_613020905_9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun showDatePickerDialog(v: View){
        val newDateFragment = DatePickerFragment()
        newDateFragment.show(supportFragmentManager, "Date Picker")
    }

    fun showInfoemation(view: View) {
        var Gender = ""
        try {
            var selectID :Int = radioGroup.checkedRadioButtonId
            var radioButtonChecked : RadioButton = findViewById(selectID)
            Gender = radioButtonChecked.text as String
        }catch (a : Exception){
            Gender = ""
        }
        show.text = "Name:${edit_name.text}\nPassword:${edit_pass.text}\nGender:${Gender}\nE-mail:${edit_email.text}\nBirthday:${birthday.text}"


    }

    fun resetInfortion(view: View) {
        edit_name.text.clear()
        edit_pass.text.clear()
        radioGroup.clearCheck()
        edit_email.text.clear()
        birthday.text = "mm / dd / yy"
        show.text = "Show Information"
    }


}