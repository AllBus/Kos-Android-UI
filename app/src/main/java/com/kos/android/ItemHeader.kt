package com.kos.android

import com.kos.android.list.IMultiItem

data class ItemHeader(val header:String) : IMultiItem {
	override fun itemType(): Int = R.layout.item_header
}