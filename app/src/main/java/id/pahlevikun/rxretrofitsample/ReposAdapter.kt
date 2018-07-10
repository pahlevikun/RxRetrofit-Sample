package id.pahlevikun.rxretrofitsample

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import id.pahlevikun.rxretrofitsample.model.Repo
import kotlinx.android.synthetic.main.item_repo.view.*

class ReposAdapter(private val context: Context, private val list: MutableList<Repo>, private val mAdapterCallback: AdapterCallback) : RecyclerView.Adapter<ReposAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_repo,
                parent, false)
        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]

        val name = item.name
        val description = item.description

        holder.itemView.tvName.text = name
        holder.itemView.tvDesc.text = description
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun clear() {
        val size = this.list.size
        this.list.clear()
        notifyItemRangeRemoved(0, size)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        init {
            itemView.tvName
            itemView.tvDesc
        }
    }

    interface AdapterCallback {
        fun onRowClicked(position: Int)
    }

    companion object {

        private val TAG = ReposAdapter::class.java.simpleName
    }
}