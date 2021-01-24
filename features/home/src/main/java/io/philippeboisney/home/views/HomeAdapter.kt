package io.philippeboisney.home.views

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import io.philippeboisney.home.HomeViewModel
import io.philippeboisney.home.R
import io.philippeboisney.model.Stocks
import io.philippeboisney.model.User

class HomeAdapter(private val viewModel: HomeViewModel): RecyclerView.Adapter<HomeViewHolder>() {

//    private val users: MutableList<Stocks.Result> = mutableListOf()
    private val stocks: MutableList<Stocks.Result> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
            = HomeViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_home, parent, false))

    override fun getItemCount(): Int
            = stocks.size

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int)
            = holder.bindTo(stocks[position], viewModel)

    // ---

    fun updateData(items: List<Stocks.Result>) {
        val diffCallback = HomeItemDiffCallback(stocks, items)
        val diffResult = DiffUtil.calculateDiff(diffCallback)

        stocks.clear()
        stocks.addAll(items)
        diffResult.dispatchUpdatesTo(this)
    }
}