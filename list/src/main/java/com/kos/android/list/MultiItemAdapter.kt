package com.kos.android.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.databinding.library.baseAdapters.BR

/**
 * @author Kos
 * Created 04.12.2021
 */
open class MultiItemAdapter<A: IMultiItem>(
        listener: OnItemClick<A>
) : ILandingItemAdapter<A>(0, listener) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseRecyclerAdapter.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<ViewDataBinding>(inflater, viewType, parent, false)
        return buildViewHolder(binding)
    }

    override fun buildViewHolder(binding: ViewDataBinding): BaseRecyclerAdapter.ViewHolder {
        return ViewHolder(binding, listener)
    }

    override fun getItemViewType(position: Int): Int {
        return item(position).itemType()
    }

    class ViewHolder<A>(binding: ViewDataBinding, listener: OnItemClick<A>) : BaseRecyclerAdapter.ViewHolder(binding) {
        init {
            binding.setVariable(BR.listener, listener)
        }
    }
}