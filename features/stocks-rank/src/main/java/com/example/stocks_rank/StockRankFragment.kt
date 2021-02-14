package com.example.stocks_rank

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.stocks_rank.databinding.FragmentStockRankBinding
import io.philippeboisney.common.base.BaseFragment
import io.philippeboisney.common.base.BaseViewModel
import org.koin.android.viewmodel.ext.android.viewModel

class StockRankFragment : BaseFragment(), View.OnClickListener {

    private val stockRankViewModel  by viewModel<StockRankViewModel>()
    private lateinit var binding: FragmentStockRankBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentStockRankBinding.inflate(inflater, container, false)
        binding.viewModel = stockRankViewModel
        binding.lifecycleOwner = viewLifecycleOwner
        binding.clickListener = this
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    override fun getViewModel(): BaseViewModel = stockRankViewModel

    override fun onClick(view: View?) {
        when (view?.id) {

        }
    }

}