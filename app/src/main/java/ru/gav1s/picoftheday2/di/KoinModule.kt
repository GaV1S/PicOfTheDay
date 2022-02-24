package ru.gav1s.picoftheday2.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import ru.gav1s.picoftheday2.model.repository.PODRetrofitImpl
import ru.gav1s.picoftheday2.model.repository.Repository
import ru.gav1s.picoftheday2.ui.main.MainViewModel

val appModule = module {
    single<Repository> { PODRetrofitImpl() }

    viewModel { MainViewModel(get()) }
}