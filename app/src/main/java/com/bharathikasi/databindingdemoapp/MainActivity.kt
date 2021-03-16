package com.bharathikasi.databindingdemoapp

import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.setContentView
import com.bharathikasi.databindingdemoapp.databinding.ActivityMainBinding
import com.bharathikasi.databindingdemoapp.pojo.User

class MainActivity : AppCompatActivity() {
    private lateinit var mDataBinding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mDataBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        mDataBinding.myVariable = "Hai bharathi sulochanaaaa.."

        val lUser = User("Sulochana Amma",50,true,"https://i.picsum.photos/id/237/200/200.jpg")
        mDataBinding.user = lUser

        /*mDataBinding.buttonOnlick.setOnClickListener {
            Toast.makeText(this,"Button clicked...",Toast.LENGTH_LONG)
        }*/

    }
}