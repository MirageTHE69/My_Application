package com.example.myapplication.domain.address

import com.example.myapplication.data.model.address

interface addressrepo {

    suspend fun getaddress():List<address>
    suspend fun updateaddress():List<address>

}