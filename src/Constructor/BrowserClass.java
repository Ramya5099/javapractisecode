package Constructor;

public class BrowserClass {
private String name;
//private double version;
private String plugin;

 public BrowserClass(String name, String plugin) {
	
	this.name = name;
	this.plugin = plugin;
}
	public String getName() {
	return name;
}
	public void setName(String name) {
	this.name = name;
}

	//public double getVersion() {
	//return version;
//}


	//public void setVersion(double version) {
	//this.version = version;
//}


	public String getPlugin() {
	return plugin;
}

	public void setPlugin(String plugin) {
	this.plugin = plugin;
}

	public String getBrowserInfo() {
		return name+ " " + plugin;
	}

}
