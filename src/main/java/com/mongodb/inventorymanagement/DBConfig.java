package com.mongodb.inventorymanagement;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class DBConfig {

    MongoDatabase makeConnection()
    {
        MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017/?readPreference=primary&appname=MongoDB%20Compass&ssl=false");
        MongoDatabase database = mongoClient.getDatabase("InventoryManagement");
        return database;
    }
}
