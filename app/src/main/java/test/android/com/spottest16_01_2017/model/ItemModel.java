package test.android.com.spottest16_01_2017.model;

public class ItemModel {
	private final String logoURL, name, time, desc;

	public ItemModel(String logoURL, String name, String time, String desc) {
		this.logoURL = logoURL;
		this.name = name;
		this.time = time;
		this.desc = desc;
	}

	public String getLogoURL() {
		return logoURL;
	}

	public String getName() {
		return name;
	}

	public String getTime() {
		return time;
	}

	public String getDesc() {
		return desc;
	}
}
