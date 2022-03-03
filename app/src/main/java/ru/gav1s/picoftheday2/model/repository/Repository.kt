package ru.gav1s.picoftheday2.model.repository

interface Repository {

    fun getRetrofitImpl(): PictureOfTheDayAPI
}