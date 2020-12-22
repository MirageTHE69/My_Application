package com.example.myapplication.data.Database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.myapplication.data.model.address
import com.example.myapplication.data.model.item


@Dao
interface addressdao {

    @Insert
    suspend fun itemlist(address : List<address>)

    @Query("DELETE FROM ITEM")
    suspend fun detadd()

    @Query("SELECT * FROM ITEM")
    suspend fun getitem(address: List<address>)


}