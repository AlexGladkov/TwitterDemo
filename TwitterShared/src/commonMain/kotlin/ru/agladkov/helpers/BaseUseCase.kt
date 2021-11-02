package ru.agladkov.helpers

interface BaseUseCase<T, R> {
    suspend fun execute(params: T): R
}