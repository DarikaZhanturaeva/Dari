package com.example.dari.di

import com.example.dari.data.repository.ProductRepository
import org.koin.core.module.Module
import org.koin.dsl.module

val repositoryModule: Module = module {
    single { ProductRepository(get()) }
}