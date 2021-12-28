package com.kos.android

import com.kos.android.list.IMultiItem

data class ItemPen(val title:String, val color:Int)  : IMultiItem {
	override fun itemType(): Int = R.layout.item_pen
}