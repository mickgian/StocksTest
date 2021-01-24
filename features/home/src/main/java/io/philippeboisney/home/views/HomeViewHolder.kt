package io.philippeboisney.home.views

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import io.philippeboisney.home.HomeViewModel
import io.philippeboisney.home.databinding.ItemHomeBinding
import io.philippeboisney.model.Stocks

class HomeViewHolder(parent: View): RecyclerView.ViewHolder(parent) {

    private val binding = ItemHomeBinding.bind(parent)

    fun bindTo(stock: Stocks.Result, viewModel: HomeViewModel) {
        binding.stock = stock
        binding.viewmodel = viewModel
    }
}