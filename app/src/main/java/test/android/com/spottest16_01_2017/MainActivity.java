package test.android.com.spottest16_01_2017;

import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.viewpagerindicator.CirclePageIndicator;

import test.android.com.spottest16_01_2017.adapter.ListPagerAdapter;
import test.android.com.spottest16_01_2017.adapter.SliderPagerAdapter;

@SuppressWarnings("ConstantConditions")
public class MainActivity extends AppCompatActivity {
	@DrawableRes
	private static final int icons[] = new int[]{R.drawable.videos, R.drawable.images, R.drawable.milestones};
	private static int pos = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final ViewPager sliderVP = (ViewPager) findViewById(R.id.vp_slider);
		sliderVP.setAdapter(new SliderPagerAdapter());
		sliderVP.postDelayed(new Runnable() {
			@Override
			public void run() {
				sliderVP.setCurrentItem(pos++ % 4, true);
				sliderVP.postDelayed(this, 2000);
			}
		}, 2000);

		CirclePageIndicator indicator = (CirclePageIndicator) findViewById(R.id.indicator);
		indicator.setViewPager(sliderVP);
		indicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
			@Override
			public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

			}

			@Override
			public void onPageSelected(int position) {
				pos = position;
			}

			@Override
			public void onPageScrollStateChanged(int state) {

			}
		});

		ViewPager listVP = (ViewPager) findViewById(R.id.vp_list);
		listVP.setAdapter(new ListPagerAdapter(getSupportFragmentManager()));

		TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
		tabLayout.setupWithViewPager(listVP);

		for (int i = 0; i < tabLayout.getTabCount(); i++) {
			tabLayout.getTabAt(i).setIcon(icons[i]);
		}
	}
}
