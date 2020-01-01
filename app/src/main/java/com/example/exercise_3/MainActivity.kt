package com.example.exercise_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radioGroupGender.check(radioButtonMale.id)

        val btnCalculate: Button = findViewById(R.id.buttonCalculate)
        btnCalculate.setOnClickListener {onCalculateInsurance()}

        val btnClear: Button = findViewById(R.id.buttonReset)
        btnClear.setOnClickListener {onClear()}
    }

    @Override
    private fun onCalculateInsurance() {
        val age: Spinner = findViewById(R.id.spinnerAge)
        val gender: RadioGroup = findViewById(R.id.radioGroupGender)
        val genderr: RadioButton = findViewById(gender.checkedRadioButtonId)
        val smoke: CheckBox = findViewById(R.id.checkBoxSmoker)

        val results: TextView = findViewById(R.id.textViewPremium)

        if(age.selectedItemPosition == 0){
            results.text = "Life Insurance Premium: RM60"
        }else if(age.selectedItemPosition == 1){
            if(genderr == radioButtonMale){
                if(smoke.isChecked){
                    results.text = "Life Insurance Premium: RM220"
                }else{
                    results.text = "Life Insurance Premium: RM120"
                }
            }else{
                if(smoke.isChecked){
                    results.text = "Life Insurance Premium: RM170"
                }else{
                    results.text = "Life Insurance =Premium: RM70"
                }
            }
        }else if(age.selectedItemPosition == 2){
            if(genderr == radioButtonMale){
                if(smoke.isChecked){
                    results.text = "Life Insurance Premium: RM3400"
                }else{
                    results.text = "Life Insurance Premium: RM190"
                }
            }else{
                if(smoke.isChecked){
                    results.text = "Life Insurance Premium: RM140"
                }else{
                    results.text = "Life Insurance =Premium: RM90"
                }
            }
        }else if(age.selectedItemPosition == 3){
            if(genderr == radioButtonMale){
                if(smoke.isChecked){
                    results.text = "Life Insurance Premium: RM470"
                }else{
                    results.text = "Life Insurance Premium: RM270"
                }
            }else{
                if(smoke.isChecked){
                    results.text = "Life Insurance Premium: RM220"
                }else{
                    results.text = "Life Insurance =Premium: RM120"
                }
            }
        }else if(age.selectedItemPosition == 4){
            if(genderr == radioButtonMale){
                if(smoke.isChecked){
                    results.text = "Life Insurance Premium: RM600"
                }else{
                    results.text = "Life Insurance Premium: RM350"
                }
            }else{
                if(smoke.isChecked){
                    results.text = "Life Insurance Premium: RM400"
                }else{
                    results.text = "Life Insurance =Premium: RM150"
                }
            }
        }else if(age.selectedItemPosition == 5){
            if(genderr == radioButtonMale){
                if(smoke.isChecked){
                    results.text = "Life Insurance Premium: RM650"
                }else{
                    results.text = "Life Insurance Premium: RM350"
                }
            }else{
                if(smoke.isChecked){
                    results.text = "Life Insurance Premium: RM450"
                }else{
                    results.text = "Life Insurance =Premium: RM150"
                }
            }
        }else{
            Toast.makeText(this,"There is some error, please try again!",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    private fun onClear() {
        val age: Spinner = findViewById(R.id.spinnerAge)
        age.setSelection(0)

        val gender: RadioGroup = findViewById(R.id.radioGroupGender)
        gender.clearCheck()

        val smoke: CheckBox = findViewById(R.id.checkBoxSmoker)
        if (smoke.isChecked()) {
            smoke.setChecked(false);
        }
        val results: TextView = findViewById(R.id.textViewPremium)
        results.text = "Life Insurance Premium"
    }
}
