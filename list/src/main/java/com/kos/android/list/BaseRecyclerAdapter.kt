package com.kos.android.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.databinding.library.baseAdapters.BR
import androidx.recyclerview.widget.RecyclerView
import java.util.*

abstract class BaseRecyclerAdapter<I, VH : BaseRecyclerAdapter.ViewHolder>(@field:LayoutRes private val itemViewLayout: Int) : RecyclerView.Adapter<VH>() {

    private var items: List<I> = emptyList()

    val isEmpty: Boolean
        get() = items.isEmpty()

    open fun replaceDataSet(list: List<I>?) {
        items = list?: emptyList()
        notifyDataSetChanged()
    }

    /**
     * Сделать копию списка
     */
    fun copyItems() : MutableList<I> {
       return ArrayList(items)
    }

    fun item(position:Int) : I = items[position]

    fun itemsSize() = items.size


    protected open fun buildViewHolder(binding: ViewDataBinding): VH {
        return ViewHolder(binding) as VH
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<ViewDataBinding>(inflater, itemViewLayout, parent, false)
        return buildViewHolder(binding)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.onBind(item(position))
    }

    override fun getItemCount(): Int {
        return if (isEmpty) 0 else items.size
    }

    open class ViewHolder(protected val binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root) {
        open fun onBind(data: Any?) {
            this.binding.setVariable(BR.modelView, data)
            binding.executePendingBindings()
        }
    }
}