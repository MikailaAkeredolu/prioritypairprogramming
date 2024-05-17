package exceptdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

//Throw - used to generate exceptions in our code
//Throws - used to

public class Main {
    //Checked Exceptions

    public static void checkInput(int number){
        if(number < 0){
            throw new IllegalArgumentException("Number must be greater than zero");
        }else{
            System.out.println("You entered: " + number);
        }
    }
    public static void makeFile(){
        File file = new File("/Users/mikaila/Downloads/shopcartfinale/src/main/resources/newfile1");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("No such path exist");
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

//    public static void writeToFile(){
//        FileWriter fileWriter = null;
//        try {
//            fileWriter = new FileWriter("/Users/mikaila/Downloads/shopcartfinale/src/main/resources/newfile");
//            fileWriter.write("John, Jack, Jane");
//            System.out.println("Wrote to file successfully");
//        } catch (IOException e) {
//            System.out.println("Unable to write to file");
//        }finally {
//            try {
//                fileWriter.close();
//            } catch (IOException e) {
//                System.out.println("unable to close resource");
//            }
//        }
//    }

//read from file
//    public static void readFromFile(){
//        File file = new File("/Users/mikaila/Downloads/shopcartfinale/src/main/resources/newfile");
//        Scanner scanner = null;
//        try {
//            scanner = new Scanner(file);
//            while(scanner.hasNext()){
//                System.out.println(scanner.nextLine());
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }finally {
//            if (scanner != null) {
//                scanner.close();
//                System.out.println("closed scanner resource");
//            }
//        }
//    }

    //Demo of Throw s again
    public static void readFromFile() throws FileNotFoundException {
        File file = new File("/Users/mikaila/Downloads/shopcartfinale/src/main/resources/newfile");
        Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }

    }


    public static void tryReadFromFileWithResources(){
        File file = new File("/Users/mikaila/Downloads/shopcartfinale/src/main/resources/newfile");
        try(Scanner scanner = new Scanner(file)) {
            while(scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }



    public static void main(String[] args) {
        //Two types of exceptions
        //makeFile();
        //writeToFile();
        //readFromFile();
       // tryReadFromFileWithResources();
        //checkInput(8);
        try {
            Person.findPersonByName("Jack Jones");
        } catch (MyCustomException e) {
            System.out.println(e.getMessage());
        }


        // Unchecked Exception is also known as a runtime
        int[] numbers = {1,2,3,4};
        //System.out.println(numbers[4]);

        //divideByZero();
    }

    public static void divideByZero(){

        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter a numerator");
            int numerator = scanner.nextInt();
            scanner.nextLine();

            System.out.println("enter a denominator");
            int denominator = scanner.nextInt();

            int result = numerator / denominator;
            System.out.println(result);

        }catch(ArithmeticException e){
            System.out.println("You cannot divide by zero");
        }catch (InputMismatchException inputMismatchException){
           inputMismatchException.printStackTrace();

        }

    }
}
