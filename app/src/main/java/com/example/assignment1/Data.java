package com.example.assignment1;

import java.util.ArrayList;

public class  Data {
    static ArrayList<Student> students =new ArrayList<>();
    public static boolean find(String email,String password){
        for (int i=0;i<students.size();i++)
            if(students.get(i).getEmail().equals(email)&&
                    students.get(i).getPassword().equals(password))
                return true;
        return false;
    }
    public static char getLevel(String email,String password){
        for (int i=0;i<students.size();i++) {
            if (students.get(i).getEmail().equals(email) &&
                    students.get(i).getPassword().equals(password))
                return students.get(i).getLevel();
        }
        return 'e';
    }
    public static String getName(String email,String password){
        for (int i=0;i<students.size();i++)
            if(students.get(i).getEmail().equals(email)&&
                    students.get(i).getPassword().equals(password))
                return students.get(i).getFirstName()+" "+students.get(i).getLastName();
        return " ";
    }
}
