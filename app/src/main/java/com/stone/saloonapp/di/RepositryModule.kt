package com.stone.saloonapp.di


import com.stone.saloonapp.repo.MyRepositoryImpl
import com.stone.saloonapp.repo.MyRepositry
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun providesRepository(impl: MyRepositoryImpl): MyRepositry
}