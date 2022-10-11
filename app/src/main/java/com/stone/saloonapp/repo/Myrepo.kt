package com.stone.saloonapp.repo

import com.stone.saloonapp.room.Users

interface MyRepositry {
    suspend fun readalluser(): List<Users>
    suspend fun insert(users: Users)
}