package com.example.data

import com.example.models.User
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals


class DataRepositoryTest {

    private lateinit var underTest: DataRepository

    @Before
    fun setUp() {
        underTest = DataRepository()
    }

    @Test
    fun `should return user data for id 1 correctly`() {
        val expected = User(1, "Farzad")

        val actual = underTest.getUsersData(1)

        assertEquals(expected, actual)
    }
}