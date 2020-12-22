package com.example.myapplication.domain.item

import com.example.myapplication.data.model.item

interface itemrepo {

    suspend fun getitem():List<item>?

    suspend fun updateitem():List<item>?



}