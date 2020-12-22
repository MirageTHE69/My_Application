package com.example.myapplication.data.repositry

import android.util.Log
import androidx.lifecycle.LiveData
import com.example.myapplication.data.fire.fireservice
import com.example.myapplication.data.model.item
import com.example.myapplication.domain.item.itemrepo

class itemrepo(

    private  val itemremote : itemDatasourceRemote,
    private  val itemlocal : itemLocalData


    ): itemrepo {



    override suspend fun getitem(): List<item>? {
        TODO("Not yet implemented")
    }

    override suspend fun updateitem(): List<item>? {
        TODO("Not yet implemented")
    }

    suspend fun getitemformfirebase():LiveData<List<item>> {
      lateinit  var itemlist:LiveData<List<item>>

        try {
            val fireservice: LiveData<List<item>> = itemremote.getitem()

                //??????????????

        }catch (exception:Exception){
            Log.i("my tag ",exception.message.toString())
        }


        return itemlist
    }

}