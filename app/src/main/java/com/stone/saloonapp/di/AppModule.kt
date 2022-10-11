package com.stone.saloonapp.di

import android.content.Context
import androidx.room.Room
import com.stone.saloonapp.room.Mydatabase
import com.stone.saloonapp.room.UsersDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun getDatabase( @ApplicationContext context: Context): Mydatabase {
        return Room.databaseBuilder(context,Mydatabase::class.java,"db").build()
    }
    @Provides
    @Singleton
    fun userDao(mydatabase: Mydatabase): UsersDao {
        return mydatabase.userDao()
    }
}
