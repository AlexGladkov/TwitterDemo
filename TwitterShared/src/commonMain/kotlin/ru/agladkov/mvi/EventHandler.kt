package ru.agladkov.mvi

interface EventHandler<E> {
    fun obtainEvent(event: E)
}