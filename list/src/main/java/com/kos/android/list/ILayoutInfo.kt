package com.kos.android.list

import androidx.annotation.LayoutRes

/**
 * Информация о том какие ляуты нужно использовать в адаптере
 * @author Kos
 * Created 09.09.2021
 */
interface ILayoutInfo {
	@LayoutRes
	fun noneLayout(): Int
	fun kinds(): Map<Int, Int>

	companion object {
		fun from(@LayoutRes none: Int, kinds: Map<Int, Int>): ILayoutInfo = object : ILayoutInfo {
			override fun noneLayout(): Int = none
			override fun kinds(): Map<Int, Int> = kinds
		}
	}
}

