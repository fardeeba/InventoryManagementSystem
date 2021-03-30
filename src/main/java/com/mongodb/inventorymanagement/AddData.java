package com.mongodb.inventorymanagement;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.types.ObjectId;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AddData {

    Scanner inputObj = new Scanner(System.in);

    DBConfig configObj = new DBConfig();
    MongoDatabase database = configObj.makeConnection();

    public void addingProduct()
    {
        String name = null, category=null;
        double price=0.0;
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

        tryCatch = false;
        while (!tryCatch) {
            try {
                System.out.print("Enter Product Category: ");
                category = inputObj.nextLine();
                tryCatch = true;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Please enter valid input");
                inputObj.next();
            }
        }

        tryCatch = false;

        while (!tryCatch) {
            try {
                System.out.print("Enter Product Price: ");
                price = inputObj.nextDouble();
                tryCatch = true;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Please enter valid input");
                inputObj.next();
            }
        }

        MongoCollection<Document> productCollection = database.getCollection("product");

        Document product = new Document("_id", new ObjectId());
        product.append("Name", name)
                .append("Category", category)
                .append("Price", price);
        productCollection.insertOne(product);
        System.out.println("Record inserted successfully");
    }

    public void addingCustomer()
    {
        String name = null, address = null, email = null;
        int contactNo = 0;
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

        tryCatch = false;
        while (!tryCatch) {
            try {
                System.out.print("Enter Customer Address: ");
                address = inputObj.nextLine();
                tryCatch = true;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Please enter valid input");
                inputObj.next();
            }
        }

        tryCatch = false;
        while (!tryCatch) {
            try {
                System.out.print("Enter Customer Email address: ");
                email = inputObj.nextLine();
                tryCatch = true;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Please enter valid input");
                inputObj.next();
            }
        }

        tryCatch = false;
        while (!tryCatch) {
            try {
                System.out.print("Enter Customer contact no:");
                contactNo = inputObj.nextInt();
                tryCatch = true;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Please enter valid input");
                inputObj.next();
            }
        }

        MongoCollection<Document> customerCollection = database.getCollection("customer");

        //add
        Document customer = new Document("_id", new ObjectId());
        customer.append("Name", name)
                .append("Address", address)
                .append("Email", email)
                .append("Contact_no", contactNo);
        customerCollection.insertOne(customer);
        System.out.println("Record inserted successfully");
    }

    public void addingSupplier()
    {
        String name = null, address = null,email = null;
        int contactNo = 0;
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

        tryCatch = false;
        while (!tryCatch) {
            try {
                System.out.print("Enter Supplier Address: ");
                address = inputObj.nextLine();
                tryCatch = true;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Please enter valid input");
                inputObj.next();
            }
        }

        tryCatch = false;
        while (!tryCatch) {
            try {
                System.out.print("Enter Supplier Email address: ");
                email = inputObj.nextLine();
                tryCatch = true;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Please enter valid input");
                inputObj.next();
            }
        }

        tryCatch = false;
        while (!tryCatch) {
            try {
                System.out.print("Enter Supplier contact no:");
                contactNo = inputObj.nextInt();
                tryCatch = true;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Please enter valid input");
                inputObj.next();
            }
        }

        MongoCollection<Document> supplierCollection = database.getCollection("supplier");

        Document supplier = new Document("_id", new ObjectId());
        supplier.append("Name", name)
                .append("Address", address)
                .append("Email", email)
                .append("Contact_no", contactNo);
        supplierCollection.insertOne(supplier);
        System.out.println("Record inserted successfully");

    }

}
