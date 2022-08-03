package com.androidlapp.formadaptabiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.androidlapp.formadaptabiz.adapter.DetailAdapter
import com.androidlapp.formadaptabiz.adapter.DetailsViewHolder
import com.androidlapp.formadaptabiz.databinding.ActivityShowEntryBinding
import com.androidlapp.formadaptabiz.model.Data
import com.androidlapp.formadaptabiz.model.Details
import com.androidlapp.formadaptabiz.viewmodel.DetailsViewModel

class ShowEntryActivity : AppCompatActivity() {

    private lateinit var binding: ActivityShowEntryBinding
    var adapter: DetailAdapter? = null
    private var savedData: List<Data>? = null
    var viewModel = DetailsViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShowEntryBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        viewModel = ViewModelProvider(this).get(DetailsViewModel::class.java)


        fetchAllData()
        setRecyclerView()
    }

    private fun fetchAllData() {
        viewModel.fetchAllData()
        viewModel.savedData.observe(this, Observer {
            showList(it)
        })
    }

    private fun showList(it: ArrayList<Data>?) {

        if (it!=null){
            savedData = it
            adapter = DetailAdapter(savedData!!)
            binding.rvShow.adapter = adapter
        }
    }

    private fun setRecyclerView() {

        val linearLayout = LinearLayoutManager(this)
        binding.rvShow.layoutManager = linearLayout
    }
}