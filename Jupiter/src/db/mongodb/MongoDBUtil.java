package db.mongodb;

public class MongoDBUtil {
	private static final String HOSTNAME = "localhost";
	private static final String PORT_NUM = "27017"; // mongoDb port
	public static final String DB_NAME = "project";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	public static final String URL = "jdbc:mysql://"
	+ HOSTNAME + ":" + PORT_NUM + "/" + DB_NAME
	+ "?user=" + USERNAME + "&password=" + PASSWORD
	+ "&autoReconnect=true&serverTimezone=UTC";
}
