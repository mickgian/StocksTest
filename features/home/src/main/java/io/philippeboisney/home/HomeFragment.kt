package io.philippeboisney.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.philippeboisney.common.base.BaseFragment
import io.philippeboisney.common.base.BaseViewModel
import io.philippeboisney.home.databinding.FragmentHomeBinding
import io.philippeboisney.home.views.HomeAdapter
import io.philippeboisney.model.User
import org.koin.android.viewmodel.ext.android.viewModel

/**
 * A simple [BaseFragment] subclass
 * that will show a list of top [User] from Github's API.
 */
class HomeFragment : BaseFragment(), View.OnClickListener {

    // FOR DATA
    private val homeViewModel: HomeViewModel by viewModel()
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.viewmodel = homeViewModel
        binding.lifecycleOwner = viewLifecycleOwner
        binding.clickListener = this
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        configureRecyclerView()
    }

    override fun getViewModel(): BaseViewModel = homeViewModel

    private fun configureRecyclerView() {
        binding.fragmentHomeRv.adapter = HomeAdapter(homeViewModel)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.stocksRankButton -> homeViewModel.navigateToStocksRank()
        }
    }
}
