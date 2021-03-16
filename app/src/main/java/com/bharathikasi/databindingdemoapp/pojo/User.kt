package com.bharathikasi.databindingdemoapp.pojo

import android.util.Log
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

data class User( val pName:String,  val pAge:Int,  val pIsActive:Boolean ,  val pImageUrl:String){
  private val TAG = "User"
    fun handleClick() {
        Log.i(TAG, "the button clicked..")
    }

 }
@BindingAdapter("android:loadImage")
fun loadImage(pImageView:ImageView,pImageUrl: String) : Unit{
    Glide.with(pImageView).load(pImageUrl).into(pImageView)
}

