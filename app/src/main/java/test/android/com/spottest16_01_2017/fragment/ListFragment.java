package test.android.com.spottest16_01_2017.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import test.android.com.spottest16_01_2017.R;
import test.android.com.spottest16_01_2017.adapter.ListAdapter;
import test.android.com.spottest16_01_2017.model.ItemModel;

public class ListFragment extends Fragment {
	private static final String thumbURLs[] = new String[]{
	    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRXoIff2sczQOJSr2spe4OT0lmBHE-R74uP2QH5sAzphkRq0Akv",
	    "http://res.cloudinary.com/demo/image/upload/w_200,h_200,c_thumb,g_face,r_max/face_left.png",
	    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRXoIff2sczQOJSr2spe4OT0lmBHE-R74uP2QH5sAzphkRq0Akv",
	    "http://res.cloudinary.com/demo/image/upload/w_200,h_200,c_thumb,g_face,r_max/face_left.png"
	};

	private static final String names[] = new String[]{
	    "Hello", "Cool", "Great", "Amazing"
	};

	private static final String times[] = new String[]{
	    "1 hour ago", "2 hours ago", "3 hours ago", "4 hours ago"
	};

	private static final String descs[] = new String[]{
	    "Awesome", "Amazing", "Cool", "Lovely"
	};

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		RecyclerView rootRV = (RecyclerView) inflater.inflate(R.layout.fraagment_list, container, false);
		rootRV.setLayoutManager(new LinearLayoutManager(getContext()));
		rootRV.setAdapter(new ListAdapter(getItemModels()));

		return rootRV;
	}

	private ArrayList<ItemModel> getItemModels() {
		ArrayList<ItemModel> models = new ArrayList<>();

		for (int i = 0; i < thumbURLs.length; i++) {
			models.add(new ItemModel(thumbURLs[i], names[i], times[i], descs[i]));
		}

		return models;
	}


}
