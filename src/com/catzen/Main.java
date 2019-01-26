package com.catzen;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Homework_number_1");
        Scanner w = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        System.out.println("Task_1");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("HelloWorld");
            } else if (i % 5 == 0) {
                System.out.println("Hello");
            } else if (i % 3 == 0) {
                System.out.println("World");
            } else {
                System.out.println(i);
            }
        }
        System.out.println("Task_2");
        Random r = new Random();
        int countOfArray = 0;
        int sumOfArray = 0;
        double arithmeticalMean;
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(10) + 10;
        }
        for (int i = 0; i < array.length; i++) {
            countOfArray = countOfArray + 1;
            sumOfArray = sumOfArray + array[i];
        }
        arithmeticalMean = (double) sumOfArray / (double) countOfArray;
        System.out.println("Array is " + Arrays.toString(array));
        System.out.println("Arithmetical mean of the array is " + arithmeticalMean);
        System.out.println("Task_3");
        int number;
        System.out.println("Enter number");
        number = w.nextInt();
        System.out.println("Your number is " + number);
        simpleNumber(number);
        System.out.println("Task_5");
        System.out.println("First method");
        for (int i = 1; i <= 30; i++) {
            System.out.print("(" + i + ")");
        }
        System.out.println();
        System.out.println("Second method");
        for (Integer i = 1; i <= 30; i++) {
            System.out.print("(" + i.toString() + ")");
        }
        System.out.println();
        System.out.println("Task_6");
        int m;
        int n;
        int u;
        int z;
        System.out.println("Enter quantity of lines of the two-dimensional array ");
        m = w.nextInt();
        System.out.println("Quantity of lines is " + m);
        System.out.println("Enter quantity of columns of the two-dimensional array ");
        n = w.nextInt();
        System.out.println("Quantity of columns is " + n);
        int ar[][] = new int[m][n];
        int arr[] = new int[n * m];
        u = 0;
        System.out.println("Two-dimensional array is ");
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                ar[i][j] = r.nextInt(10);
                arr[u++] = ar[i][j];
                System.out.print(ar[i][j] + "_");
            }
            System.out.println();
        }
        System.out.println("Array is " + Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j >= 0; j--) {
                if (arr[j] > arr[j + 1]) {
                    z = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = z;
                }
            }
        }
        System.out.println("Sorted array is " + Arrays.toString(arr));
        u = 0;
        System.out.println("Sorted two-dimensional array is ");
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                ar[i][j] = arr[u++];
                System.out.print(ar[i][j] + "_");
            }
            System.out.println();
        }
        System.out.println("Task_7");
        file();
        System.out.println("Task_9");
        String date;
        System.out.println("Enter date in type of Day.Month.Year_Hours:Minutes:Seconds");
        date = s.nextLine();
        System.out.println("Your date is " + date);
        String[] str = date.split("_");
        String[] str2 = str[0].split("\\.");
        String[] str3 = str[1].split(":");
        int day = Integer.parseInt(str2[0]);
        int month = Integer.parseInt(str2[1]);
        int year = Integer.parseInt(str2[2]);
        int hours = Integer.parseInt(str3[0]);
        int minutes = Integer.parseInt(str3[1]);
        int seconds = Integer.parseInt(str3[2]);
        if (day >= 1 && day <= 31) {
            System.out.println("Day is " + day);
        } else {
            throw new NumberFormatException("Incorrect data of day");
        }
        if (month >= 1 && month <= 12) {
            System.out.println("Month is " + month);
        } else {
            throw new NumberFormatException("Incorrect data of month");
        }
        System.out.println("Year is " + year);
        if (hours >= 0 && hours <= 24) {
            System.out.println("Hours are " + hours);
        } else {
            throw new NumberFormatException("Incorrect data of hours");
        }
        if (minutes >= 0 && minutes <= 60) {
            System.out.println("Minutes are " + minutes);
        } else {
            throw new NumberFormatException("Incorrect data of minutes");
        }
        if (seconds >= 0 && seconds <= 60) {
            System.out.println("Seconds are " + seconds);
        } else {
            throw new NumberFormatException("Incorrect data of seconds");
        }
        String date1 = "";
        switch (month) {
            case 1:
                date1 = "January";
                break;
            case 2:
                date1 = "February";
                break;
            case 3:
                date1 = "March";
                break;
            case 4:
                date1 = "April";
                break;
            case 5:
                date1 = "May";
                break;
            case 6:
                date1 = "June";
                break;
            case 7:
                date1 = "July";
                break;
            case 8:
                date1 = "August";
                break;
            case 9:
                date1 = "September";
                break;
            case 10:
                date1 = "October";
                break;
            case 11:
                date1 = "November";
                break;
            case 12:
                date1 = "December";
                break;
            default:
                System.out.println("ERROR!!!");
        }
        switch (hours) {
            case 0:
                System.out.println("Date is " + day + " " + date1 + ", " + hours + " : " + minutes + " AM");
                break;
            case 1:
                System.out.println("Date is " + day + " " + date1 + ", " + hours + " : " + minutes + " AM");
                break;
            case 2:
                System.out.println("Date is " + day + " " + date1 + ", " + hours + " : " + minutes + " AM");
                break;
            case 3:
                System.out.println("Date is " + day + " " + date1 + ", " + hours + " : " + minutes + " AM");
                break;
            case 4:
                System.out.println("Date is " + day + " " + date1 + ", " + hours + " : " + minutes + " AM");
                break;
            case 5:
                System.out.println("Date is " + day + " " + date1 + ", " + hours + " : " + minutes + " AM");
                break;
            case 6:
                System.out.println("Date is " + day + " " + date1 + ", " + hours + " : " + minutes + " AM");
                break;
            case 7:
                System.out.println("Date is " + day + " " + date1 + ", " + hours + " : " + minutes + " AM");
                break;
            case 8:
                System.out.println("Date is " + day + " " + date1 + ", " + hours + " : " + minutes + " AM");
                break;
            case 9:
                System.out.println("Date is " + day + " " + date1 + ", " + hours + " : " + minutes + " AM");
                break;
            case 10:
                System.out.println("Date is " + day + " " + date1 + ", " + hours + " : " + minutes + " AM");
                break;
            case 11:
                System.out.println("Date is " + day + " " + date1 + ", " + hours + " : " + minutes + " AM");
                break;
            case 12:
                System.out.println("Date is " + day + " " + date1 + ", " + hours + " : " + minutes + " PM");
                break;
            case 13:
                System.out.println("Date is " + day + " " + date1 + ", " + 1 + " : " + minutes + " PM");
                break;
            case 14:
                System.out.println("Date is " + day + " " + date1 + ", " + 2 + " : " + minutes + " PM");
                break;
            case 15:
                System.out.println("Date is " + day + " " + date1 + ", " + 3 + " : " + minutes + " PM");
                break;
            case 16:
                System.out.println("Date is " + day + " " + date1 + ", " + 4 + " : " + minutes + " PM");
                break;
            case 17:
                System.out.println("Date is " + day + " " + date1 + ", " + 5 + " : " + minutes + " PM");
                break;
            case 18:
                System.out.println("Date is " + day + " " + date1 + ", " + 6 + " : " + minutes + " PM");
                break;
            case 19:
                System.out.println("Date is " + day + " " + date1 + ", " + 7 + " : " + minutes + " PM");
                break;
            case 20:
                System.out.println("Date is " + day + " " + date1 + ", " + 8 + " : " + minutes + " PM");
                break;
            case 21:
                System.out.println("Date is " + day + " " + date1 + ", " + 9 + " : " + minutes + " PM");
                break;
            case 22:
                System.out.println("Date is " + day + " " + date1 + ", " + 10 + " : " + minutes + " PM");
                break;
            case 23:
                System.out.println("Date is " + day + " " + date1 + ", " + 11 + " : " + minutes + " PM");
                break;
            case 24:
                System.out.println("Date is " + day + " " + date1 + ", " + 12 + " : " + minutes + " PM");
                break;
            default:
                System.out.println("ERROR!!!");
        }
        System.out.println("Task_10");
        String name;
        String surname;
        int age;
        String sex;
        String university;
        String faculty;
        String group;
        Student student = new Student();
        System.out.println("Enter student`s name");
        name = s.nextLine();
        student.setName(name);
        System.out.println("Enter student`s surname");
        surname = s.nextLine();
        student.setSurname(surname);
        System.out.println("Enter student`s age");
        age = w.nextInt();
        student.setAge(age);
        System.out.println("Enter student`s sex");
        sex = s.nextLine();
        student.setSex(sex);
        System.out.println("Enter student`s University");
        university = s.nextLine();
        student.setUniversity(university);
        System.out.println("Enter student`s faculty");
        faculty = s.nextLine();
        student.setFaculty(faculty);
        System.out.println("Enter student`s group");
        group = s.nextLine();
        student.setGroup(group);
        System.out.println(student.toString());
        System.out.println("Task_11");
        ArrayList<House> listHouse = new ArrayList<>();
        listMethod(listHouse);
    }

    public static void simpleNumber(int number) {
        for (int i = 2; i <= number; i++) {
            if ((number % i != 0 && number % 2 != 0 && number % 3 != 0) || number == 2) {
                System.out.println("Your number is simple");
                return;

            } else if (number % i == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Your number is not simple");
    }

    public static void file() throws FileNotFoundException {
        File file = new File("test.txt");
        Scanner fil = new Scanner(file);
        int symbols;
        int words = 0;
        int lines = 0;
        String arr1 = new Scanner(new File("test.txt")).useDelimiter("_").next();
        System.out.println("String is " + arr1);
        symbols = arr1.length();
        while (fil.hasNextLine()) {
            lines++;
            String[] arr2 = fil.nextLine().split(" ");
            words = words + arr2.length;
        }
        System.out.println("Quantity of symbols in file is " + symbols);
        System.out.println("Quantity of words in file is " + words);
        System.out.println("Quantity of lines if file is " + lines);
    }

    public static int listMethod(ArrayList<House> house1) {
        Scanner w = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("What would you like to do?");
        System.out.println("1 adds elements in the list");
        System.out.println("2 prints list on the desktop");
        System.out.println("3 deletes duplicates from the list");
        System.out.println("4 prints the list on the desktop without duplicates");
        System.out.println("5 closes the method");
        System.out.println("What would you do? Please enter");
        n = w.nextInt();
        switch (n) {
            case 1:
                House house = new House();
                String streetName;
                int houseNumber;
                System.out.println("Enter name of street where house is");
                streetName = s.nextLine();
                house.setStreetName(streetName);
                System.out.println("Enter number of house");
                houseNumber = w.nextInt();
                house.setHouseNumber(houseNumber);
                house1.add(house);
                break;
            case 2:
                System.out.println("List is " + house1);
                break;
            case 3:
                Set<House> setHouse = new HashSet<>(house1);
                house1.clear();
                house1.addAll(setHouse);
                break;
            case 4:
                System.out.println("List without duplicates : " + house1);
                break;
            case 5:
                System.out.println("Method is closed");
                return 0;
            default:
                return 0;
        }

        return listMethod(house1);
    }
}
