package com.kos.android.list.binding;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.kos.android.list.BaseRecyclerAdapter;
import com.kos.android.list.LandingItemAdapter;
import com.kos.android.list.MultiItemAdapter;
import com.kos.android.list.OnItemClick;

import java.util.List;

public class ListBinding {

	/**
	 * @param view        - отображающий список элементов
	 * @param adapterData - коллекция данных списка
	 */
	@BindingAdapter({"adapterData", "listitem"})
	public static void adapterData(@NonNull RecyclerView view, List<?> adapterData, @LayoutRes int layout) {
		BaseRecyclerAdapter adapter = (BaseRecyclerAdapter) view.getAdapter();
		if (adapter == null) {
			adapter = new LandingItemAdapter(layout, itemData -> {	});
			view.setAdapter(adapter);
		}
		adapter.replaceDataSet(adapterData);
	}

	/**
	 * @param view        - отображающий список элементов
	 * @param adapterData - коллекция данных списка
	 *
	 */
	@BindingAdapter({"adapterData", "adapter"})
	public static void adapterData(@NonNull RecyclerView view, List<?> adapterData, BaseRecyclerAdapter adapter) {
		if (view.getAdapter() != adapter){
			view.setAdapter(adapter);
		}

		if (adapter != null) {
			adapter.replaceDataSet(adapterData);
		}
	}


	/**
	 * @param view        - отображающий список элементов
	 * @param adapterData - коллекция данных списка
	 *
	 */
	@BindingAdapter({"adapterData", "adapter"})
	public static <T> void adapterListData(@NonNull RecyclerView view, List<T> adapterData, ListAdapter<T, ?> adapter) {
		if (view.getAdapter() != adapter){
			view.setAdapter(adapter);
		}

		if (adapter != null) {
			adapter.submitList(adapterData);
		}
	}


	/**
	 * @param view        - отображающий список элементов
	 * @param adapterData - коллекция данных списка
	 */
	@BindingAdapter({"adapterData", "listitem", "onItemClick"})
	public static void adapterData(@NonNull RecyclerView view, List<?> adapterData, @LayoutRes int layout, OnItemClick<?> itemClick) {
		BaseRecyclerAdapter adapter = (BaseRecyclerAdapter) view.getAdapter();
		if (adapter == null) {
			adapter = new LandingItemAdapter(layout, itemClick);
			view.setAdapter(adapter);
		}
		adapter.replaceDataSet(adapterData);
	}

	/**
	 * @param view        - отображающий список элементов
	 * @param adapterData - коллекция данных списка
	 */
	@BindingAdapter({"multiData",  "onItemClick"})
	public static void adapterData(@NonNull RecyclerView view, List<?> adapterData, OnItemClick<?> itemClick) {
		BaseRecyclerAdapter adapter = (BaseRecyclerAdapter) view.getAdapter();
		if (adapter == null) {
			adapter = new MultiItemAdapter(itemClick);
			view.setAdapter(adapter);
		}
		adapter.replaceDataSet(adapterData);
	}

	/**
	 * @param view        - отображающий список элементов
	 * @param adapterData - коллекция данных списка
	 */
	@BindingAdapter({"adapterData", "listitem"})
	public static void pagerAdapterData(@NonNull ViewPager2 view, List<?> adapterData, @LayoutRes int layout) {
		BaseRecyclerAdapter adapter = (BaseRecyclerAdapter) view.getAdapter();
		if (adapter == null) {
			adapter = new LandingItemAdapter(layout, itemData -> {	});
			view.setAdapter(adapter);
		}
		adapter.replaceDataSet(adapterData);
	}

	/**
	 * @param view        - отображающий список элементов
	 * @param adapterData - коллекция данных списка
	 */
	@BindingAdapter({"adapterData", "listitem", "onItemClick"})
	public static void pagerAdapterData(@NonNull ViewPager2 view, List<?> adapterData, @LayoutRes int layout, OnItemClick<?> itemClick) {
		BaseRecyclerAdapter adapter = (BaseRecyclerAdapter) view.getAdapter();
		if (adapter == null) {
			adapter = new LandingItemAdapter(layout, itemClick);
			view.setAdapter(adapter);
		}
		adapter.replaceDataSet(adapterData);
	}

	/**
	 * @param view        - отображающий список элементов
	 * @param adapterData - коллекция данных списка
	 */
	@BindingAdapter({"multiData",  "onItemClick"})
	public static void pagerAdapterData(@NonNull ViewPager2 view, List<?> adapterData, OnItemClick<?> itemClick) {
		BaseRecyclerAdapter adapter = (BaseRecyclerAdapter) view.getAdapter();
		if (adapter == null) {
			adapter = new MultiItemAdapter(itemClick);
			view.setAdapter(adapter);
		}
		adapter.replaceDataSet(adapterData);
	}


	/**
	 * @param view        - отображающий список элементов
	 * @param adapterData - коллекция данных списка
	 *
	 */
	@BindingAdapter({"adapterData", "adapter"})
	public static void pagerAdapterData(@NonNull ViewPager2 view, List<?> adapterData, BaseRecyclerAdapter adapter) {
		if (view.getAdapter() != adapter){
			view.setAdapter(adapter);
		}

		if (adapter != null) {
			adapter.replaceDataSet(adapterData);
		}
	}

	/**
	 * @param view        - отображающий список элементов
	 * @param adapterData - коллекция данных списка
	 *
	 */
	@BindingAdapter({"adapterData", "adapter"})
	public static <T> void pagerListData(@NonNull ViewPager2 view, List<T> adapterData, ListAdapter<T, ?> adapter) {
		if (view.getAdapter() != adapter){
			view.setAdapter(adapter);
		}

		if (adapter != null) {
			adapter.submitList(adapterData);
		}
	}
}
