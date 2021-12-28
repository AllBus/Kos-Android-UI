package com.kos.android.list

import androidx.annotation.LayoutRes

/**
 * Адаптер для списка, находящегося внутри карточки на главной странице
 * @author Kos
 * 15.06.2020
 */
abstract class ILandingItemAdapter<A>(
	@field:LayoutRes
	protected val itemViewLayout: Int,
	val listener: OnItemClick<A>
) : BaseRecyclerAdapter<A, BaseRecyclerAdapter.ViewHolder>(itemViewLayout) {

	/** Метод предназначен для вызова когда надо обновить часть содержимого item,
	 * например, когда элемент добавлен в избранное, в закладки */
	open fun rebind() {
		notifyDataSetChanged()
	}
}