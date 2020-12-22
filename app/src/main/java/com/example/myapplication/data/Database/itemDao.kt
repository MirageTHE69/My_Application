package com.example.myapplication.data.Database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.myapplication.data.model.item


@Dao
interface itemDao {

  @Insert
  suspend fun itemlist(item : List<item>)

  @Query ("DELETE FROM ITEM")
  suspend fun detellist()

  @Query ("SELECT * FROM ITEM")
  suspend fun getitem():LiveData<List<item>>

}