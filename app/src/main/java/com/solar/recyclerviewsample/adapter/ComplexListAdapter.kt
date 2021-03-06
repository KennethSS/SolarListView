package com.solar.recyclerviewsample.adapter

import android.os.Parcelable
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import com.solar.recyclerview.ViewModelList
import com.solar.recyclerview.adapter.normal.AbstractDataBindingAdapter
import com.solar.recyclerviewsample.complex.AbstractComplexModel
import com.solar.recyclerviewsample.model.food.Food
import com.solar.recyclerviewsample.viewmodel.FoodViewModel

/**
 * Copyright 2020 Kenneth
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 **/
class ComplexListAdapter(viewModelList: ViewModelList<Food>, lifecycleOwner: LifecycleOwner)
    : AbstractDataBindingAdapter<Food>(viewModelList) {

    init {
        viewModelList.list.observe(lifecycleOwner, Observer {
            notifyDataSetChanged()
        })
    }

    //private val stateList = hashMapOf<String, Parcelable>()
}