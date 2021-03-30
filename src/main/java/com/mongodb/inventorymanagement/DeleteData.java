package com.mongodb.inventorymanagement;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.DeleteResult;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.mongodb.client.model.Filters.eq;

public class DeleteData {

    Scanner inputObj =  new Scanner(System.in);

    DBConfig configObj = new DBConfig();
    MongoDatabase database = configObj.makeConnection();

    public void deletingProduct()
    {
        MongoCollection<Document> productCollection = database.getCollection("product");

        String name=null;
        boolean tryCatch = false;

        while (!tryCatch) {
            try {
                System.out.print("Enter Product Name: ");
                name = inputObj.nextLine();
                tryCatch = true;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Please enter valid input");
                inputObj.next();
            }
        }

        Bson productName = eq("Name", name);
        DeleteResult result = productCollection.deleteOne(productName);
        System.out.println(result);

    }

    public void deletingCustomer()
    {
        MongoCollection<Document> customerCollection = database.getCollection("customer");

        String name=null;
        boolean tryCatch = false;

        while (!tryCatch) {
            try {
                System.out.print("Enter Customer Name: ");
                name = inputObj.nextLine();
                tryCatch = true;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Please enter valid input");
                inputObj.next();
            }
        }

        Bson customerName = eq("Name", name);
        DeleteResult result = customerCollection.deleteOne(customerName);
        System.out.println(result);
    }

    public void deletingSupplier()
    {
        MongoCollection<Document> supplierCollection = database.getCollection("supplier");

        String name=null;
        boolean tryCatch = false;

        while (!tryCatch) {
            try {
                System.out.print("Enter Supplier Name: ");
                name = inputObj.nextLine();
                tryCatch = true;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Please enter valid input");
                inputObj.next();
            }
        }

        Bson supplierName = eq("Name", name);
        DeleteResult result = supplierCollection.deleteOne(supplierName);
        System.out.println(result);
    }
}
