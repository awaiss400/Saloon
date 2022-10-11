package com.stone.saloonapp.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class Users(
    @PrimaryKey(autoGenerate = true)
    val id: Int =0,
    val name: String,
    val address: String,
    val mail: String,
)