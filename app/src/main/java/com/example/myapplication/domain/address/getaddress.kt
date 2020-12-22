package com.example.myapplication.domain.address

import com.example.myapplication.data.model.address

class getaddress(private  val addressrepo: addressrepo) {

    suspend fun execute(): List<address> = addressrepo.getaddress()


}