package com.example.fetchitemsapp

import androidx.lifecycle.*
import kotlinx.coroutines.launch

class ItemViewModel : ViewModel() {

    private val _groupedItems = MutableLiveData<Map<Int, List<Item>>>()
    val groupedItems: LiveData<Map<Int, List<Item>>> get() = _groupedItems

    fun fetchItems() {
        viewModelScope.launch {
            val response = RetrofitClient.apiService.getItems()
            if (response.isSuccessful) {
                val filteredSortedItems = response.body()
                    ?.filter { !it.name.isNullOrBlank() }
                    ?.sortedWith(compareBy<Item> { it.listId }.thenBy { it.name })
                    ?: emptyList()

                val grouped = filteredSortedItems.groupBy { it.listId }
                _groupedItems.postValue(grouped)
            }
        }
    }
}
