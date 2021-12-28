package com.kos.android

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.kos.android.databinding.ActivityListBinding
import com.kos.android.list.IMultiItem
import com.kos.android.list.OnItemClick

class ListActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		val binding = DataBindingUtil.setContentView<ActivityListBinding>(this, R.layout.activity_list)


		binding.listener = object:OnItemClick<IMultiItem> {
			override fun onCardClick(itemData: IMultiItem) {
				when (itemData){
					is ItemPen ->
						Toast.makeText(this@ListActivity, "Click ItemPen ${itemData.title}", Toast.LENGTH_SHORT).show()
					is ItemHeader ->
						Toast.makeText(this@ListActivity, "Click Header ${itemData.header}", Toast.LENGTH_SHORT).show()
				}
			}
		}
		binding.items = penList()


	}


	fun penList(): List<IMultiItem> = listOf(
		ItemHeader("Visual"),
		ItemPen("GREEN", Color.GREEN),
		ItemPen("YELLOW", Color.YELLOW),
		ItemPen("BLUE", Color.BLUE),
		ItemHeader("Content"),
		ItemPen("CYAN", Color.CYAN),
		ItemPen("GRAY", Color.GRAY),
		ItemPen("RED", Color.RED),
		ItemPen("MAGENTA", Color.MAGENTA),
		ItemPen("LTGRAY", Color.LTGRAY)
	)
}