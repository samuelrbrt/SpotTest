package test.android.com.spottest16_01_2017.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import test.android.com.spottest16_01_2017.fragment.ListFragment;

public class ListPagerAdapter extends FragmentPagerAdapter {
	private static final String titles[] = new String[]{"VIDEOS", "IMAGES", "MILESTONE"};

	public ListPagerAdapter(FragmentManager fragmentManager) {
		super(fragmentManager);
	}

	@Override
	public Fragment getItem(int position) {
		return new ListFragment();
	}

	@Override
	public int getCount() {
		return 3;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		return titles[position];
	}
}
