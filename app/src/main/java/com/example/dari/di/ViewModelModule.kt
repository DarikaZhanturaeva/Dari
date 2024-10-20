package com.example.dari.di

import com.example.dari.ui.fragment.product.ProductViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val viewModelModule : Module = module {
    viewModel {
        ProductViewModel(get())
    }
}