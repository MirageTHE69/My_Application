package com.example.myapplication.data.repositry

import androidx.lifecycle.LiveData
import com.example.myapplication.data.fire.fireservice
import com.example.myapplication.data.model.item

class itemRemoteData(private  val firebaseservice : fireservice,

                     private  val apikey : String
    ):itemDatasourceRemote {
    override suspend fun getitem(): LiveData<List<item>> =  firebaseservice.getitem()



         //if pi requred
        //return firebaseservice.getitem()
        //pls watch lesson number 107 for api remote model


}