package com.example.myapplication.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "address")
data class address(

    @PrimaryKey
    val id : Int,

    val address: String

)
{

}