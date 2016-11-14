package trading.marketdata;

public abstract class Market {

	private String marketname;
	private String hostname;
	int port;
	
	public Market(String name, String url, int rport) {
		marketname = name;
		hostname = url;
		port = rport;
	}
	
	public String getMarketname() { return marketname; }
	public String getHostname() { return hostname; }
	public int getPort() { return port; }

}
