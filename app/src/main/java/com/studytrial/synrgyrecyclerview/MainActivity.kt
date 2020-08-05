package com.studytrial.synrgyrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.RadioButton
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val listHewan = arrayListOf(
        KelasData("Sapi", "Australia", 21),
        KelasData("Kambing", "Sulawesi", 24),
        KelasData("Rusa", "Amerika", 3),
        KelasData("Sapi", "Australia", 21),
        KelasData("Kambing", "Sulawesi", 24),
        KelasData("Rusa", "Amerika", 3),
        KelasData("Sapi", "Australia", 21),
        KelasData("Kambing", "Sulawesi", 24),
        KelasData("Rusa", "Amerika", 3),
        KelasData("Sapi", "Australia", 21),
        KelasData("Kambing", "Sulawesi", 24),
        KelasData("Rusa", "Amerika", 3),
        KelasData("Sapi", "Australia", 21),
        KelasData("Kambing", "Sulawesi", 24),
        KelasData("Rusa", "Amerika", 3),
        KelasData("Sapi", "Australia", 21),
        KelasData("Kambing", "Sulawesi", 24),
        KelasData("Rusa", "Amerika", 3),
        KelasData("Sapi", "Australia", 21),
        KelasData("Kambing", "Sulawesi", 24),
        KelasData("Rusa", "Amerika", 3),
        KelasData("Sapi", "Australia", 21),
        KelasData("Kambing", "Sulawesi", 24),
        KelasData("Rusa", "Amerika", 3),
        KelasData("Sapi", "Australia", 21),
        KelasData("Kambing", "Sulawesi", 24),
        KelasData("Rusa", "Amerika", 3),
        KelasData("Sapi", "Australia", 21),
        KelasData("Kambing", "Sulawesi", 24),
        KelasData("Rusa", "Amerika", 3),
        KelasData("Sapi", "Australia", 21),
        KelasData("Kambing", "Sulawesi", 24),
        KelasData("Rusa", "Amerika", 3),
        KelasData("Sapi", "Australia", 21),
        KelasData("Kambing", "Sulawesi", 24),
        KelasData("Rusa", "Amerika", 3),
        KelasData("Sapi", "Australia", 21),
        KelasData("Kambing", "Sulawesi", 24),
        KelasData("Rusa", "Amerika", 3),
        KelasData("Sapi", "Australia", 21),
        KelasData("Kambing", "Sulawesi", 24),
        KelasData("Rusa", "Amerika", 3)
    )

    val listBuah = arrayListOf(
        KelasData("Apel", "Malang", 2100),
        KelasData("Pisang", "Ambon", 3200),
        KelasData("Durian", "Bangkok", 600),
        KelasData("Apel", "Malang", 2100),
        KelasData("Pisang", "Ambon", 3200),
        KelasData("Durian", "Bangkok", 600),
        KelasData("Apel", "Malang", 2100),
        KelasData("Pisang", "Ambon", 3200),
        KelasData("Durian", "Bangkok", 600),
        KelasData("Apel", "Malang", 2100),
        KelasData("Pisang", "Ambon", 3200),
        KelasData("Durian", "Bangkok", 600),
        KelasData("Apel", "Malang", 2100),
        KelasData("Pisang", "Ambon", 3200),
        KelasData("Durian", "Bangkok", 600),
        KelasData("Apel", "Malang", 2100),
        KelasData("Pisang", "Ambon", 3200),
        KelasData("Durian", "Bangkok", 600),
        KelasData("Apel", "Malang", 2100),
        KelasData("Pisang", "Ambon", 3200),
        KelasData("Durian", "Bangkok", 600),
        KelasData("Apel", "Malang", 2100),
        KelasData("Pisang", "Ambon", 3200),
        KelasData("Durian", "Bangkok", 600),
        KelasData("Apel", "Malang", 2100),
        KelasData("Pisang", "Ambon", 3200),
        KelasData("Durian", "Bangkok", 600),
        KelasData("Apel", "Malang", 2100),
        KelasData("Pisang", "Ambon", 3200),
        KelasData("Durian", "Bangkok", 600),
        KelasData("Apel", "Malang", 2100),
        KelasData("Pisang", "Ambon", 3200),
        KelasData("Durian", "Bangkok", 600),
        KelasData("Apel", "Malang", 2100),
        KelasData("Pisang", "Ambon", 3200),
        KelasData("Durian", "Bangkok", 600),
        KelasData("Apel", "Malang", 2100),
        KelasData("Pisang", "Ambon", 3200),
        KelasData("Durian", "Bangkok", 600),
        KelasData("Apel", "Malang", 2100),
        KelasData("Pisang", "Ambon", 3200),
        KelasData("Durian", "Bangkok", 600),
        KelasData("Apel", "Malang", 2100),
        KelasData("Pisang", "Ambon", 3200),
        KelasData("Durian", "Bangkok", 600),
        KelasData("Apel", "Malang", 2100),
        KelasData("Pisang", "Ambon", 3200),
        KelasData("Durian", "Bangkok", 600)
    )
    val adapterHewan = KelasAdapter(listHewan)
    val adapterBuah = KelasAdapter(listBuah)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        recyclerview.layoutManager = layoutManager

    }

    fun onRadioButtonClicked(view: View) {
        if (view is RadioButton) {
            // Is the button now checked?
            val checked = view.isChecked

            // Check which radio button was clicked
            when (view.getId()) {
                R.id.rb_hewan ->
                    if (checked) {
                        Log.d("Binar","test2")
                        recyclerview.adapter = adapterHewan
                    }
                R.id.rb_buah ->
                    if (checked) {
                        Log.d("Binar","test")
                        recyclerview.adapter = adapterBuah
                    }
            }
        }

    }
}