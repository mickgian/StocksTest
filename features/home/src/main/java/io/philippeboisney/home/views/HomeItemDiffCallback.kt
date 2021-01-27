package io.philippeboisney.home.views

import androidx.recyclerview.widget.DiffUtil
import io.philippeboisney.model.Stocks
import io.philippeboisney.model.StocksUI
import io.philippeboisney.model.User

class HomeItemDiffCallback(private val oldList: List<StocksUI>,
                           private val newList: List<StocksUI>) : DiffUtil.Callback() {

    override fun getOldListSize() = oldList.size

    override fun getNewListSize() = newList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int)
            = oldList[oldItemPosition] == newList[newItemPosition]

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].fullExchangeName == newList[newItemPosition].fullExchangeName
    }
}