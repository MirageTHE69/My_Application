package com.example.myapplication.domain.item


import com.example.myapplication.data.model.item

class updateitem(private  val itemrepo: itemrepo)
{
    suspend fun execute():List<item>? = itemrepo.updateitem()
    
}