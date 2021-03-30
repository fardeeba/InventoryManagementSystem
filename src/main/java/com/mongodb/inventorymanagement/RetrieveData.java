package com.mongodb.inventorymanagement;

import com.mongodb.client.*;
import org.bson.Document;

import java.util.Scanner;

import static com.mongodb.client.model.Filters.gte;

public class RetrieveData {

    Scanner inputObj = new Scanner(System.in);

    DBConfig configObj = new DBConfig();
    MongoDatabase database = configObj.makeConnection();

    public void retrievingProduct()
    {
        MongoCollection<Document> productCollection = database.getCollection("product");
        FindIterable<Document> iterable = productCollection.find(gte("Name", "Rose petal"));
        MongoCursor<Document> cursor = iterable.iterator();
        while (cursor.hasNext()) {
            System.out.println(cursor.next().toJson());
        }
    }

    public void retrievingCustomer()
    {
        MongoCollection<Document> customerCollection = database.getCollection("customer");
        FindIterable<Document> iterable = customerCollection.find(gte("Name", "Farah"));
        MongoCursor<Document> cursor = iterable.iterator();
        while (cursor.hasNext()) {
            System.out.println(cursor.next().toJson());
        }
    }

    public void retrievingSupplier()
    {
        MongoCollection<Document> supplierCollection = database.getCollection("supplier");
        FindIterable<Document> iterable = supplierCollection.find(gte("Name", "Ahmed"));
        MongoCursor<Document> cursor = iterable.iterator();
        while (cursor.hasNext()) {
            System.out.println(cursor.next().toJson());
        }
    }

}
