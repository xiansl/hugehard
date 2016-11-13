package trading.marketdata;

public abstract class Market {

	private String name;
	private String url;
	
	public Market(String marketName, String refUrl) {
		name = marketName;
		url = refUrl;
	}
	
	public String getName() { return name; }
	public String getUrl() { return url; }

}
