package com.kos.android.list

import androidx.annotation.LayoutRes
import androidx.databinding.ViewDataBinding
import androidx.databinding.library.baseAdapters.BR

/**
 * @author Kos
 * Created 15.06.2020
 */
open class LandingItemAdapter<A>(
        @LayoutRes
        itemViewLayout: Int,
        listener: OnItemClick<A>
) : ILandingItemAdapter<A>(itemViewLayout, listener) {

    override fun buildViewHolder(binding: ViewDataBinding): BaseRecyclerAdapter.ViewHolder {
        return ViewHolder(binding)
    }

    inner class ViewHolder(binding: ViewDataBinding) : BaseRecyclerAdapter.ViewHolder(binding) {
        init {
            binding.setVariable(BR.listener, listener)
        }
    }


}