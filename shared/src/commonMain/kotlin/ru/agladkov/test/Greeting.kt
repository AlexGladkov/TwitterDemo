package ru.agladkov.test

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}