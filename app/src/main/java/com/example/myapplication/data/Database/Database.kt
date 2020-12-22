package com.example.myapplication.data.Database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myapplication.data.model.item


@Database(entities = [item::class],version = 1 , exportSchema = false)
abstract class Database: RoomDatabase() {

    abstract fun itemdao(): itemDao

    abstract fun addressdao(): addressdao

}