package com.example.jetpackcomposeapp.architecture.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jetpackcomposeapp.architecture.data.ComposeArchModel
import com.example.jetpackcomposeapp.architecture.data.ComposeArchRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ComposeArchViewModel : ViewModel() {

    private val reposity = ComposeArchRepository()

    private val _loading = MutableLiveData<Boolean>()
    val loading: LiveData<Boolean> = _loading

    private val _items = MutableStateFlow<List<ComposeArchModel>>(mutableListOf())
    val items: StateFlow<List<ComposeArchModel>> = _items

    init {
        fetchItems(0)
    }

    private fun fetchItems(page : Int) {
        viewModelScope.launch {
            _loading.value = true
            _items.value = reposity.getSampleData(page).toMutableList()
            _loading.value = false
        }
    }

}