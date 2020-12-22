package com.example.myapplication.data.repositry

import androidx.lifecycle.LiveData
import com.example.myapplication.data.model.item

interface itemDatasourceRemote {

    suspend fun getitem(): LiveData<List<item>>

}