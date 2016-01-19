//Singleton class to manage properties file
public class PropertiesManager {
	
	private static final Logger log = LogManager.getLogger(Constant.LOG_APPENDER_WS);
	private String propFileName = "fileName.properties";
	
	private Properties prop = new Properties();
	
	private static class LazyHolder{
		private static final PropertiesManager INSTANCE = new PropertiesManager();
	}
	
	private PropertiesManager(){
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
		try{
			prop.load(inputStream);
		}catch(IOException e){
			log.error("Unable to load Properties file: "+e);
		}
	}
	
	public static PropertiesManager getInstance(){
		return LazyHolder.INSTANCE;
	}
	
	public String getdataSource() throws Exception {
		return prop.getProperty("deca.ds");
	}
	
	public String getProperty(String property){
		return prop.getProperty(property);
	}
}
