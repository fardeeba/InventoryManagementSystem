package com.mongodb.inventorymanagement;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CurdOps {

    public static void main(String[] args) {

        Scanner inputObj = new Scanner(System.in);
        boolean tryCatch;
        String carryOn = "yes";


        do {
            int choice1 = 0, choice2 =0;
            tryCatch = false;
            while (!tryCatch){
                try {
                    System.out.println("Menu");
                    System.out.println("Press 1 to add data");
                    System.out.println("Press 2 to retrieve data");
                    System.out.println("Press 3 to update data");
                    System.out.println("Press 4 to delete data");
                    choice1 = inputObj.nextInt();
                    tryCatch = true;
                    if (choice1 < 1 || choice1 > 6) {
                        System.out.println("Error: Enter only integer values between 1 and 6");
                    }
                }
                catch (InputMismatchException e)
                {
                    System.out.println("Error: Enter only integer values between 1 and 6");
                    inputObj.next();
                }
            }

            switch (choice1) {
                case 1:
                    AddData addData = new AddData();
                    tryCatch = false;
                    while (!tryCatch) {
                        try {
                            System.out.println("Press 1 to add new product");
                            System.out.println("Press 2 to add new customer");
                            System.out.println("Press 3 to add new supplier");
                            choice2 = inputObj.nextInt();
                            tryCatch = true;
                            if (choice2 < 1 || choice2 > 6) {
                                System.out.println("Error: Enter only integer values between 1 and 6");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Error: Enter only integer values between 1 and 6");
                            inputObj.next();
                        }
                    }
                    switch (choice2) {
                        case 1:
                            addData.addingProduct();
                            break;
                        case 2:
                            addData.addingCustomer();
                            break;
                        case 3:
                            addData.addingSupplier();
                            break;
                        default:
                            System.out.println("Invalid Input");
                            break;
                    }
                    break;
                case 2:
                    RetrieveData retrieveData = new RetrieveData();
                    tryCatch = false;
                    while (!tryCatch) {
                        try {
                            System.out.println("Press 1 to retrieve list of products");
                            System.out.println("Press 2 to retrieve list of customers");
                            System.out.println("Press 3 to retrieve list of suppliers");
                            choice2 = inputObj.nextInt();
                            tryCatch = true;
                            if (choice2 < 1 || choice2 > 6) {
                                System.out.println("Error: Enter only integer values between 1 and 6");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Error: Enter only integer values between 1 and 6");
                            inputObj.next();
                        }
                    }
                    switch (choice2) {
                        case 1:
                            retrieveData.retrievingProduct();
                            break;
                        case 2:
                            retrieveData.retrievingCustomer();
                            break;
                        case 3:
                            retrieveData.retrievingSupplier();
                            break;
                        default:
                            System.out.println("Invalid Input");
                            break;
                    }
                    break;
                case 3:
                    UpdateData updateData = new UpdateData();
                    tryCatch = false;
                    while (!tryCatch) {
                        try {
                            System.out.println("Press 1 to update product record");
                            System.out.println("Press 2 to update customer record");
                            System.out.println("Press 3 to update supplier record");
                            choice2 = inputObj.nextInt();
                            tryCatch = true;
                            if (choice2 < 1 || choice2 > 6) {
                                System.out.println("Error: Enter only integer values between 1 and 6");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Error: Enter only integer values between 1 and 6");
                            inputObj.next();
                        }
                    }
                    switch (choice2) {
                        case 1:
                            updateData.updatingProduct();
                            break;
                        case 2:
                            updateData.updatingCustomer();
                            break;
                        case 3:
                            updateData.updatingSupplier();
                            break;
                        default:
                            System.out.println("Invalid input");
                            break;
                    }
                    break;
                case 4:
                    DeleteData deleteData = new DeleteData();
                    tryCatch = false;
                    while (!tryCatch) {
                        try {
                            System.out.println("Press 1 to delete product record");
                            System.out.println("Press 2 to delete customer record");
                            System.out.println("Press 3 to delete supplier record");
                            choice2 = inputObj.nextInt();
                            tryCatch = true;
                            if (choice2 < 1 || choice2 > 6) {
                                System.out.println("Error: Enter only integer values between 1 and 6");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Error: Enter only integer values between 1 and 6");
                            inputObj.next();
                        }
                    }
                    switch (choice2) {
                        case 1:
                            deleteData.deletingProduct();
                            break;
                        case 2:
                            deleteData.deletingCustomer();
                            break;
                        case 3:
                            deleteData.deletingSupplier();
                            break;
                        default:
                            System.out.println("Invalid Input");
                            break;
                    }
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
            tryCatch = false;
            while (!tryCatch) {
                try {
                    System.out.println("Do you want to continue? Yes : No");
                    carryOn = inputObj.next();
                    tryCatch = true;
                } catch (InputMismatchException e) {
                    System.out.println("Enter valid choice");
                    inputObj.next();
                }
            }

        }while (carryOn.equals("yes"));

    }

}
