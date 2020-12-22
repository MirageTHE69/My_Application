package com.example.myapplication.domain.item

import com.example.myapplication.data.model.item


class getitem (private  val itemrepo: itemrepo) {

    suspend fun execute():List<item>? = itemrepo.getitem()

}