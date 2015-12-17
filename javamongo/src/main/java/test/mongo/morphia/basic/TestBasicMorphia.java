package test.mongo.morphia.basic;

import java.util.ArrayList;
import java.util.List;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;

import com.mongodb.MongoClient;

public class TestBasicMorphia {
	public static void main(String [] args) {
		Morphia morphia = new Morphia();
		morphia.map(Address.class).map(Person.class);
		MongoClient mongoClient = new MongoClient();// assuming that db is installed on the local host and running on port 27017
		Datastore ds = morphia.createDatastore(mongoClient, "Examples");
		Person person = getTestData();
		ds.save(person);
		Query<Person> query = ds.find(Person.class).field("name").equal("Guru");
		Person personFromDB = query.get();
		System.out.println(personFromDB.getName());		
	}
	
	private static Person getTestData() {
		Person person = new Person();
		person.setName("Guru");
		List<Integer> books = new ArrayList<Integer>();
		person.setBooks(books);
		Address address = new Address();
		address.setAddressLine1("Bangalore");
		address.setAddressLine2("Karnataka");
		//person.setAddress(address);
		
		return person;
	}
}
