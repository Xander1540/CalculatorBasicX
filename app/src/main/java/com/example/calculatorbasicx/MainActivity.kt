package com.example.calculatorbasicx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.calculatorbasicx.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAdd.setOnClickListener{
            if(binding.edtNo1.text.toString()!="" && binding.edtNo2.toString()!=""){

                val no1= binding.edtNo1.text.toString().toInt()
                val no2= binding.edtNo2.text.toString().toInt()

                val sum=no1+no2

                Toast.makeText(this, "Sum = $sum", Toast.LENGTH_LONG).show()

            }else{
                Toast.makeText(this,"Please enter numbers.", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnSub.setOnClickListener{
            if(binding.edtNo1.text.toString()!="" && binding.edtNo2.toString()!=""){

                val no1= binding.edtNo1.text.toString().toInt()
                val no2= binding.edtNo2.text.toString().toInt()

                val sub: Int = if(no1>no2) {
                    no1 - no2
                }else{
                    no2-no1
                }
                Toast.makeText(this, "Difference = $sub", Toast.LENGTH_LONG).show()

            }else{
                Toast.makeText(this,"Please enter numbers.", Toast.LENGTH_SHORT).show()


            }
        }

        binding.btnMul.setOnClickListener{
            if(binding.edtNo1.text.toString()!="" && binding.edtNo2.toString()!=""){

                val no1= binding.edtNo1.text.toString().toInt()
                val no2= binding.edtNo2.text.toString().toInt()

                val mul=no1*no2
                Toast.makeText(this, "Product = $mul", Toast.LENGTH_LONG).show()

            }else{
                Toast.makeText(this,"Please enter numbers.", Toast.LENGTH_SHORT).show()


            }
        }

        binding.btnDiv.setOnClickListener{
            if(binding.edtNo1.text.toString()!="" && binding.edtNo2.toString()!=""){

                val no1= binding.edtNo1.text.toString().toInt()
                val no2= binding.edtNo2.text.toString().toInt()

                val div=no1/no2
                Toast.makeText(this, "Division = $div", Toast.LENGTH_LONG).show()

            }else{
                Toast.makeText(this,"Please enter numbers.", Toast.LENGTH_SHORT).show()
            }
        }

    }
}