package localmongodemo.model;

import java.util.Iterator;
import java.util.Set;

import org.bson.Document;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class LOcalConnectionDemo {
	public static void main(String[] args) {
		MongoClient mongo = new MongoClient("localhost", 27017);
		DB db = mongo.getDB("mydb");
		Set<String> collections = db.getCollectionNames();
		System.out.println(collections);
		MongoDatabase database = mongo.getDatabase("mydb");
		MongoCollection collection = database.getCollection("my_details");

		
		  Document doc = new Document();
		  doc.append("name","Yamini");
		  doc.append("dob","30-12-2000");
		  doc.append("religion","Muslim");
		  doc.append("name","Nitheesh");
		  doc.append("dob","08-06-2000");
		  doc.append("religion","Hindu"); 
		  doc.append("name","Dileep");
		  doc.append("dob","10-07-2001");
		  doc.append("religion","Christian"); 
		  doc.append("name","Kalai");
		  doc.append("dob","30-12-2000");
		  doc.append("religion","Muslim");
		  collection.insertOne(doc);
		  System.out.println(collection); 
		 

			/*
			 * FindIterable<Document> iterDoc = collection.find(); Iterator it =
			 * iterDoc.iterator(); while (it.hasNext()) { System.out.println(it.next()); }
			 */
	}
	}

