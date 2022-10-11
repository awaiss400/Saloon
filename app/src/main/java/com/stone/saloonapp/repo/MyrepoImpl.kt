package com.stone.saloonapp.repo

import com.stone.saloonapp.room.Users
import com.stone.saloonapp.room.UsersDao
import javax.inject.Inject

class MyRepositoryImpl @Inject constructor(val userDao: UsersDao):MyRepositry {
    override suspend fun readalluser(): List<Users> {
        return userDao.readalldata()
    }

    override suspend fun insert(users: Users) {
        userDao.insert(users)
    }
}