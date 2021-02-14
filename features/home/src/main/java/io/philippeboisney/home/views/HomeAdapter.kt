package io.philippeboisney.home.views

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import io.philippeboisney.home.HomeViewModel
import io.philippeboisney.home.R
import io.philippeboisney.model.StocksUI
import kotlinx.android.synthetic.main.item_home.view.*

class HomeAdapter(private val viewModel: HomeViewModel): RecyclerView.Adapter<HomeViewHolder>(), Filterable {

    private val stocks: MutableList<StocksUI> = mutableListOf()
    var stocksFilterList: ArrayList<StocksUI>

    init {
        stocksFilterList = stocks as ArrayList<StocksUI>
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = HomeViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_home, parent, false))

//    override fun getItemCount(): Int
//            = stocks.size

    override fun getItemCount(): Int
            = stocksFilterList.size

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int)
            = holder.bindTo(stocksFilterList[position], viewModel)

    // ---

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(stocksUI: StocksUI): Unit {
            itemView.textViewValue.text = stocksUI.shortName
        }
    }

    override fun getFilter():  Filter{
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence?): FilterResults {
                val charSearch = constraint.toString()
                if (charSearch.isEmpty()) {
                    stocksFilterList = stocks as ArrayList<StocksUI>
                } else {
                    val resultList = ArrayList<StocksUI>()
                    for (row in stocks) {
                        if (row.shortName?.toLowerCase()?.contains(constraint.toString().toLowerCase()) == true) {
                            resultList.add(row)
                        }
                    }
                    stocksFilterList = resultList
                }
                val filterResults = FilterResults()
                filterResults.values = stocksFilterList
                return filterResults
            }

            override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
                stocksFilterList = results?.values as ArrayList<StocksUI>
                notifyDataSetChanged()
            }
        }
    }

    fun updateData(items: List<StocksUI>?) {
        val diffCallback = HomeItemDiffCallback(stocks, items as List<StocksUI>)
        val diffResult = DiffUtil.calculateDiff(diffCallback)

        stocks.clear()
        stocks.addAll(items)
        diffResult.dispatchUpdatesTo(this)
    }
}