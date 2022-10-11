package com.stone.saloonapp.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface UsersDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(users: Users)
    @Query("SELECT * FROM users ORDER BY id DESC")

    suspend fun readalldata():List<Users>
//    suspend fun readalldata():LiveData<List<Users>>

}