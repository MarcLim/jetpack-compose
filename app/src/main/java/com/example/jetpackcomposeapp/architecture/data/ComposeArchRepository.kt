package com.example.jetpackcomposeapp.architecture.data

import kotlinx.coroutines.delay

class ComposeArchRepository {

    suspend fun getSampleData(page : Int, size : Int = 20) : List<ComposeArchModel> {
        delay(2000)
        val data : MutableList<ComposeArchModel> = mutableListOf()
        (0 .. size).forEach {
            val itemNumber = page + it
            data.add(ComposeArchModel(title = "title $itemNumber", description = "description $itemNumber"))
        }
        return data.toList()
    }

}