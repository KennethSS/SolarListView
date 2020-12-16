package com.solar.recyclerview.adapter.normal

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import com.solar.recyclerview.holder.BindingHolder
import com.solar.recyclerview.ItemType

abstract class DataBindingAdapter<T : ItemType>(private val viewModel: ViewModel?)
    : BaseAdapter<T, BindingHolder<T>>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BindingHolder<T> {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<ViewDataBinding>(
            layoutInflater,
            viewType,
            parent,
            false
        )
        return BindingHolder(binding)
    }

    override fun onBindViewHolder(holder: BindingHolder<T>, position: Int) {
        if (list.isNotEmpty()) {
            Log.d("DataBindingAdapter", "position: $position")
            holder.bind(list[position], position, viewModel)
        }
    }
}