package com.mongodb.inventorymanagement;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.set;

public class UpdateData {

    Scanner inputObj =  new Scanner(System.in);

    DBConfig configObj = new DBConfig();
    MongoDatabase database = configObj.makeConnection();

    public void updatingProduct()
    {
        MongoCollection<Document> productCollection = database.getCollection("product");

        String name=null, category=null;
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
        Bson productName = eq("Name", name);
        Bson setCategory = set("Category", category);
        Bson setPrice = set("Price", price);
        UpdateResult updateResult1 = productCollection.updateOne(productName,setCategory);
        UpdateResult updateResult2 = productCollection.updateOne(productName,setPrice);
        System.out.println(productCollection.find(productName).first().toJson());
        System.out.println(updateResult1);
        System.out.println(updateResult2);
    }


    public void updatingCustomer()
    {
        MongoCollection<Document> customerCollection = database.getCollection("customer");

        String name=null, address=null, email=null;
        int contactNo=0;
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
            try{
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
        Bson customerName = eq("Name", name);
        Bson setAddress = set("Address", address);
        Bson setEmail = set("Email", email);
        Bson setContactNo = set("Contact_no",contactNo);
        UpdateResult updateResult1 = customerCollection.updateOne(customerName,setAddress);
        UpdateResult updateResult2 = customerCollection.updateOne(customerName,setEmail);
        UpdateResult updateResult3 = customerCollection.updateOne(customerName,setContactNo);
        System.out.println(customerCollection.find(customerName).first().toJson());
        System.out.println(updateResult1);
        System.out.println(updateResult2);
        System.out.println(updateResult3);
    }

    public void updatingSupplier()
    {
        MongoCollection<Document> supplierCollection = database.getCollection("supplier");

        String name=null, address=null,email=null;
        int contactNo =0;
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
        Bson customerName = eq("Name", name);
        Bson setAddress = set("Address", address);
        Bson setEmail = set("Email", email);
        Bson setContactNo = set("Contact_no",contactNo);
        UpdateResult updateResult1 = supplierCollection.updateOne(customerName,setAddress);
        UpdateResult updateResult2 = supplierCollection.updateOne(customerName,setEmail);
        UpdateResult updateResult3 = supplierCollection.updateOne(customerName,setContactNo);
        System.out.println(supplierCollection.find(customerName).first().toJson());
        System.out.println(updateResult1);
        System.out.println(updateResult2);
        System.out.println(updateResult3);
    }

}
