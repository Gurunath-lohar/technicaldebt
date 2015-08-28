package test.mongo.basic;

import java.util.Arrays;
import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class TestConnection {
	public static void main(String args []) {
		TestConnection testConnection = new TestConnection();
		MongoClient mongoClient = new MongoClient();// assuming that db is installed on the local host and running on port 27017
		DBObject person = testConnection.getTestData();
		DB database = mongoClient.getDB("Examples");
		DBCollection collection = database.getCollection("people");		    
		//collection.insert(person);
		DBObject query = new BasicDBObject("_id", "jo");
		DBCursor cursor = collection.find(query);
		DBObject dbObj = cursor.one();
		System.out.println(dbObj.get("address"));
	}
	
	private DBObject getTestData() {
		List<Integer> books = Arrays.asList(27464, 747854);
		DBObject person = new BasicDBObject("_id", "jo")
		                            .append("name", "Jo Bloggs")
		                            .append("address", new BasicDBObject("street", "123 Fake St")
		                                                         .append("city", "Faketon")
		                                                         .append("state", "MA")
		                                                         .append("zip", 12345))
		                            .append("books", books);
		
		return person;
	}
}
