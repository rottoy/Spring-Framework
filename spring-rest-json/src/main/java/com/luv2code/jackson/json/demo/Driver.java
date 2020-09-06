package com.luv2code.jackson.json.demo;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {

    public static void main(String[] args) {

        try{
            // create object mapper
            ObjectMapper mapper = new ObjectMapper();

            // read JSON file and map/convert to Java POJO :
            // data/sample-lite.json
            Student theStudent=
                    mapper.readValue(new File("data/sample-full.json"),Student.class);

            // print first name and last name
            System.out.println("First name = "+theStudent.getFirstName());
            System.out.println("First name = "+theStudent.getLastName());
            System.out.println(theStudent.getAddress());
            for(String temp : theStudent.getLanguages()){
                System.out.println(temp);
            }



        } catch (Exception exc){
            exc.printStackTrace();
        }
    }
}
