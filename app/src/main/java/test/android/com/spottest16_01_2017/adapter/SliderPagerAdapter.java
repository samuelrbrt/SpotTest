package test.android.com.spottest16_01_2017.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import test.android.com.spottest16_01_2017.R;

public class SliderPagerAdapter extends PagerAdapter {
	@Override
	public int getCount() {
		return 4;
	}

	@Override
	public Object instantiateItem(ViewGroup view, int position) {
		ImageView imageLayout = (ImageView) LayoutInflater.from(view.getContext()).inflate(R.layout.item_image, view, false);
		imageLayout.setImageResource(R.mipmap.ic_launcher);
		view.addView(imageLayout, 0);

		return imageLayout;
	}

	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
		container.removeView((View) object);
	}

	@Override
	public boolean isViewFromObject(View view, Object object) {
		return view.equals(object);
	}
}
