package com.example.data

import com.example.models.User

class DataRepository {
    fun getUsersData(id: Int) = User(
        id = id,
        name = "Farzad"
    )
}