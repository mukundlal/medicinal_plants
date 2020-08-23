package com.codermonklab.medicinalplants

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import kotlinx.android.synthetic.main.med_plant_card.view.*

class ListAdapter(val datamod: ArrayList<MedData>) :RecyclerView.Adapter<ListAdapter.Holder>(){
 lateinit var context:Context
    class Holder(item:View):RecyclerView.ViewHolder(item) {

        fun bind(data: MedData) {
            medName.text=data.name
            medScitificName.text=data.sciname

        }
        val medName=item.medName
        val medScitificName=item.medScitificName
        val medImage=item.medImage
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        context=parent.context
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.med_plant_card,parent,false))
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val data=datamod[position]
        holder.bind(data)
        Glide.with(context)
            .load(data.imagePath)
            .transform(RoundedCorners(16))
            .into(holder.medImage)
        holder.itemView.setOnClickListener {
            val i=Intent(context,OpenItem::class.java)
            i.putExtra("DATA",data)
            context.startActivity(i)
        }
    }

    override fun getItemCount()=datamod.size

}