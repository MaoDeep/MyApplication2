package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.math.RoundingMode
import java.text.DecimalFormat
import kotlin.math.round

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       button.setOnClickListener {
            var arr2 = arrayOf(
                editTextTextMultiLine.text,
                editTextTextMultiLine6.text,
                editTextTextMultiLine7.text,
                editTextTextMultiLine8.text,
                editTextTextMultiLine9.text
            )
            if (arr2[0].toString() == "" || arr2[1].toString() == "" || arr2[2].toString() == "" || arr2[3].toString() == "" || arr2[4].toString() == "") {
                Toast.makeText(
                    applicationContext,
                    "Please Input Subjects ",
                    Toast.LENGTH_SHORT
                )
                    .show()
            }


            var arr = arrayOf(
                editTextTextMultiLine11.text,
                editTextTextMultiLine12.text,
                editTextTextMultiLine13.text,
                editTextTextMultiLine14.text,
                editTextTextMultiLine15.text
            )
            if (arr[0].toString() == "" || arr[1].toString() == "" || arr[2].toString() == "" || arr[3].toString() == "" || arr[4].toString() == "") {
                Toast.makeText(
                    applicationContext,
                    "Please Input Credit ",
                    Toast.LENGTH_SHORT
                )
                    .show()
            } else {
                if (arr[0].toString().toInt() < 4 && arr[1].toString()
                        .toInt() < 4 && arr[2].toString()
                        .toInt() < 4 && arr[3].toString().toInt() < 4 && arr[4].toString()
                        .toInt() < 4
                ) {
                    var num =
                        (arr[0].toString().toInt() + arr[1].toString()
                            .toInt() + arr[2].toString()
                            .toInt() + arr[3].toString().toInt() + arr[4].toString()
                            .toInt())
                    textView14.setText(num.toString())
                } else {
                    Toast.makeText(
                        applicationContext,
                        "Please Input Credit < 3",
                        Toast.LENGTH_SHORT
                    )
                        .show()
                }
            }

            var arr1 = arrayOf(
                editTextTextMultiLine18.text,
                editTextTextMultiLine17.text,
                editTextTextMultiLine19.text,
                editTextTextMultiLine16.text,
                editTextTextMultiLine20.text
            )
            if (arr1[0].toString() == "" || arr1[1].toString() == "" || arr1[2].toString() == "" || arr1[3].toString() == "" || arr1[4].toString() == "") {
                Toast.makeText(
                    applicationContext,
                    "Please Input GPA ",
                    Toast.LENGTH_SHORT
                )
                    .show()
            } else {
                var num2 = ((arr1[0].toString().toDouble() * arr[0].toString().toDouble()) +
                        (arr1[1].toString().toDouble() * arr[1].toString().toDouble()) +
                        (arr1[2].toString().toDouble() * arr[2].toString().toDouble()) +
                        (arr1[3].toString().toDouble() * arr[3].toString().toDouble()) +
                        (arr1[4].toString().toDouble() * arr[4].toString().toDouble())
                        )


                var num1 =
                    (arr[0].toString().toInt() + arr[1].toString()
                        .toInt() + arr[2].toString()
                        .toInt() + arr[3].toString().toInt() + arr[4].toString().toInt())

                var num3 = (num2.toDouble() / num1.toDouble())


                val df = DecimalFormat("#.##")
                df.roundingMode = RoundingMode.CEILING
                textView13.setText(df.format(num3))


            }

        }

        button2.setOnClickListener {
            editTextTextMultiLine.setText("")
            editTextTextMultiLine6.setText("")
            editTextTextMultiLine7.setText("")
            editTextTextMultiLine8.setText("")
            editTextTextMultiLine9.setText("")
            editTextTextMultiLine11.setText("")
            editTextTextMultiLine12.setText("")
            editTextTextMultiLine13.setText("")
            editTextTextMultiLine14.setText("")
            editTextTextMultiLine15.setText("")
            editTextTextMultiLine18.setText("")
            editTextTextMultiLine17.setText("")
            editTextTextMultiLine19.setText("")
            editTextTextMultiLine16.setText("")
            editTextTextMultiLine20.setText("")
            textView14.setText("")
            textView13.setText("")
        }


    }
}