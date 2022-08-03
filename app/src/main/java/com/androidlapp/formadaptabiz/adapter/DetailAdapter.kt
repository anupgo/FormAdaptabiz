package com.androidlapp.formadaptabiz.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.androidlapp.formadaptabiz.R
import com.androidlapp.formadaptabiz.model.Data

class DetailAdapter(val savedDetails : List<Data>): RecyclerView.Adapter<DetailsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_address,parent,false)
        return DetailsViewHolder(view)
    }

    override fun onBindViewHolder(holder: DetailsViewHolder, position: Int) {

        val position = savedDetails[position]

            holder.name_tv.text = position.name
            holder.email_tv.text = position.email
            holder.phone_tv.text = position.phone
            holder.desc_tv.text = position.description
            holder.gender_tv.text = position.gender



    }

    override fun getItemCount(): Int {
        return savedDetails.size
    }


}

class DetailsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val name_tv:TextView = itemView.findViewById(R.id.name)
    val email_tv:TextView = itemView.findViewById(R.id.email)
    val phone_tv:TextView = itemView.findViewById(R.id.phone)
    val desc_tv:TextView = itemView.findViewById(R.id.desc)
    val gender_tv :TextView = itemView.findViewById(R.id.male)



}