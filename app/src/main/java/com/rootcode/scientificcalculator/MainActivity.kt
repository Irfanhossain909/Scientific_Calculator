package com.rootcode.scientificcalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rootcode.scientificcalculator.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.idBtnone.setOnClickListener {
            binding.idTvPrimary.text = (binding.idTvPrimary.text.toString()+"1")
        }
        binding.idBtntwo.setOnClickListener {
            binding.idTvPrimary.text = (binding.idTvPrimary.text.toString()+"2")
        }
        binding.idBtnthree.setOnClickListener {
            binding.idTvPrimary.text = (binding.idTvPrimary.text.toString()+"3")
        }
        binding.idBtnfour.setOnClickListener {
            binding.idTvPrimary.text = (binding.idTvPrimary.text.toString()+"4")
        }
        binding.idBtnfive.setOnClickListener {
            binding.idTvPrimary.text = (binding.idTvPrimary.text.toString()+"5")
        }
        binding.idBtnsix.setOnClickListener {
            binding.idTvPrimary.text = (binding.idTvPrimary.text.toString()+"6")
        }
        binding.idBtnseven.setOnClickListener {
            binding.idTvPrimary.text = (binding.idTvPrimary.text.toString()+"7")
        }
        binding.idBtneight.setOnClickListener {
            binding.idTvPrimary.text = (binding.idTvPrimary.text.toString()+"8")
        }
        binding.idBtnnine.setOnClickListener {
            binding.idTvPrimary.text = (binding.idTvPrimary.text.toString()+"9")
        }
        binding.idBtnzero.setOnClickListener {
            binding.idTvPrimary.text = (binding.idTvPrimary.text.toString()+"0")
        }
        binding.idBtndot.setOnClickListener {
            binding.idTvPrimary.text = (binding.idTvPrimary.text.toString()+".")
        }
        binding.idBtnplus.setOnClickListener {
            binding.idTvPrimary.text = (binding.idTvPrimary.text.toString()+"+")
        }
        binding.idBtnminus.setOnClickListener {
            binding.idTvPrimary.text = (binding.idTvPrimary.text.toString()+"-")

        }
        binding.idBtnmultiply.setOnClickListener {
            binding.idTvPrimary.text = (binding.idTvPrimary.text.toString()+"*")
        }
        binding.idBtnDiv.setOnClickListener {
            binding.idTvPrimary.text = (binding.idTvPrimary.text.toString()+"/")
        }
        binding.idBtnbrac1.setOnClickListener {
            binding.idTvPrimary.text = (binding.idTvPrimary.text.toString()+"(")
        }
        binding.idBtnbrac2.setOnClickListener {
            binding.idTvPrimary.text = (binding.idTvPrimary.text.toString()+")")
        }
        binding.idBtnpi.setOnClickListener {
            binding.idTvPrimary.text = (binding.idTvPrimary.text.toString()+"3.142")
            binding.idTCSecondary.text =(binding.idTCSecondary.text.toString())
        }
        binding.idBtnSin.setOnClickListener {
            binding.idTvPrimary.text = (binding.idTvPrimary.text.toString()+"sin")
        }
        binding.idBtnCos.setOnClickListener {
            binding.idTvPrimary.text = (binding.idTvPrimary.text.toString()+"cos")
        }
        binding.idBtntan.setOnClickListener {
            binding.idTvPrimary.text = (binding.idTvPrimary.text.toString()+"tan")
        }
        binding.idBtnInv.setOnClickListener {
            binding.idTvPrimary.text = (binding.idTvPrimary.text.toString()+"^"+"(-1)")
        }
        binding.idBtnin.setOnClickListener {
            binding.idTvPrimary.text = (binding.idTvPrimary.text.toString()+"In")
        }
        binding.idBtnlog.setOnClickListener {
            binding.idTvPrimary.text = (binding.idTvPrimary.text.toString()+"log")
        }





    }
}