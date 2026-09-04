package com.example.petshop

abstract class Mood(val date: String) {
    abstract fun currentMood(): String

    fun getMood(): String {
        return "On $date, the pet was feeling ${currentMood()}"
    }
}

class happyMood(date: String): Mood(date) {
    override fun currentMood(): String {
        return "Happy"
    }
}

class sadMood(date: String): Mood(date) {
    override fun currentMood(): String {
        return "Sad"
    }
}