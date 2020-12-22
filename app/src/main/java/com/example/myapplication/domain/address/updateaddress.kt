package com.example.myapplication.domain.address

import com.example.myapplication.data.model.address

class updateaddress(private  val addressrepo: addressrepo) {

    suspend fun execute(): List<address> = addressrepo.updateaddress()

}