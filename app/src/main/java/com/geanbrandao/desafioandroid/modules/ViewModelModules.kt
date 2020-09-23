package com.geanbrandao.desafioandroid.modules

import com.geanbrandao.desafioandroid.ui.home.HomeViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { HomeViewModel() }
}