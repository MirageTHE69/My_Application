package com.example.myapplication.data.repositry

import androidx.lifecycle.LiveData
import com.example.myapplication.data.model.item

interface itemDatasourceLocal {


    suspend fun getitem(): LiveData<List<item>>
    suspend fun updateitemtoDatabase(item:List<item>)
    suspend fun clearitemData()

}