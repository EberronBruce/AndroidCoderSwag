/*
 * Created by Bruce Burgess at Red Raven Computing Studios. Copyright (c) 2020.
 */

package com.redravencomputing.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.redravencomputing.coderswag.R
import com.redravencomputing.coderswag.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)
    }
}