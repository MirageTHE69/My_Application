package com.example.myapplication.data.repositry

import androidx.lifecycle.LiveData
import com.example.myapplication.data.Database.itemDao
import com.example.myapplication.data.model.item
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class itemLocalData(private  val itemDao: itemDao):itemDatasourceLocal {
    override suspend fun getitem(): LiveData<List<item>> {
        return  itemDao.getitem()
    }

    override suspend fun updateitemtoDatabase(item: List<item>) {
        CoroutineScope(Dispatchers.IO).launch {

            itemDao.itemlist(item)
        }
    }

    override suspend fun clearitemData() {
       CoroutineScope(Dispatchers.IO).launch {

           itemDao.detellist()
       }
    }
}