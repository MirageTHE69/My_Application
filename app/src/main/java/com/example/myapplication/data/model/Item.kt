package com.example.myapplication.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
@Entity (tableName =  "item")
data class item(

    @PrimaryKey
    val id : Int,

    val name :String,

    val img : Int,

    val price: Int,

    val count : Int

    )
{



}