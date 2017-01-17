package test.android.com.spottest16_01_2017.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import test.android.com.spottest16_01_2017.R;
import test.android.com.spottest16_01_2017.model.ItemModel;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
	private ArrayList<ItemModel> models;

	public ListAdapter(ArrayList<ItemModel> models) {
		this.models = models;
	}

	@Override
	public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
		return new ViewHolder(itemView);
	}

	@Override
	public void onBindViewHolder(ViewHolder holder, int position) {
		ItemModel model = models.get(position);

		holder.logoIV.setImageResource(R.mipmap.ic_launcher);
		holder.nameTV.setText(model.getName());
		holder.timeTV.setText(model.getTime());
		holder.descTV.setText(model.getDesc());
	}

	@Override
	public int getItemCount() {
		return models.size();
	}

	class ViewHolder extends RecyclerView.ViewHolder {
		ImageView logoIV;
		TextView nameTV, timeTV, descTV;

		ViewHolder(View itemView) {
			super(itemView);

			logoIV = (ImageView) itemView.findViewById(R.id.item_iv_logo);
			nameTV = (TextView) itemView.findViewById(R.id.item_tv_name);
			timeTV = (TextView) itemView.findViewById(R.id.item_tv_time);
			descTV = (TextView) itemView.findViewById(R.id.item_tv_desc);
		}
	}
}
