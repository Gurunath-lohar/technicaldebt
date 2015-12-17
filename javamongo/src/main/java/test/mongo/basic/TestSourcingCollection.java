package test.mongo.basic;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoOptions;
import com.mongodb.ServerAddress;

public class TestSourcingCollection {
	public static void main(String args []) {
		TestSourcingCollection testConnection = new TestSourcingCollection();
		MongoOptions moptions = new MongoOptions();
		moptions.setSocketTimeout(2000);
		ServerAddress srvAddr = new ServerAddress("sm-rppsourcingtool1.db.stratus.qa.ebay.com", 27017);
		Mongo mongo = new Mongo(srvAddr, moptions);
		DB db = mongo.getDB("rppsourcingtooldb");		
	    DBCollection collection = db.getCollection("sourcing");
		DBObject sourcing = testConnection.getTestData();
		for(int i=0 ; i<100 ; i++) {
			DBCursor cursor = collection.find(sourcing);
			System.out.println(cursor.count());
			cursor.close();
		}
		/*DBObject dbObj = cursor.one();
		
		System.out.println(dbObj.get("address"));*/
	}
	
	private DBObject getTestData() {
		DBObject person = new BasicDBObject("deleted", false).append("siteId", 0);
		
		return person;
	}
}
