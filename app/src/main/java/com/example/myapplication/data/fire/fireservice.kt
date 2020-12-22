package com.example.myapplication.data.fire

import androidx.lifecycle.LiveData
import com.example.myapplication.data.model.item
import retrofit2.Response

interface fireservice {

  suspend fun getitem():LiveData<List<item>>{

    val list = getitem();
    return  list;


  }

}