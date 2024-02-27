package com.yavuzselimmeletlioglu.landmarkbookkotlin

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yavuzselimmeletlioglu.landmarkbookkotlin.databinding.RecyclerRowBinding

class LandmarksAdapter(var landmarksList: ArrayList<Landmarks>) : RecyclerView.Adapter<LandmarksAdapter.LandmarksViewHolder>() {


    class LandmarksViewHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarksViewHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return LandmarksViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return landmarksList.size
    }

    override fun onBindViewHolder(holder: LandmarksViewHolder, position: Int) {
        holder.binding.recyclerViewTextView.text = landmarksList.get(position).landmarkName
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,DetailsActivity::class.java)
            intent.putExtra("landmark" , landmarksList.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }
}