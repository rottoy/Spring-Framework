package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{

    //create an array of strings
    private ArrayList<String> data;

    //create a random number generator
    private Random random = new Random();

    //read Strings from text file
    @PostConstruct
    public void loadFortuneFiles(){
        System.out.println(">>FileFortuneService:inside method loadTheFortunesFile");

        //file should be contain outside of /src directory.
        File theFile = new File("fortune.txt");
        System.out.println("File exists : "+theFile.exists());

        //initialize ArrayList
        data =new ArrayList<String>();

        //read the fortune file
        try(BufferedReader br = new BufferedReader(new FileReader(theFile))){
                String tempLine;
                while((tempLine=br.readLine())!=null){
                    data.add(tempLine);
                }

        }catch (IOException e){
            e.printStackTrace();
        }

    }

    @Override
    public String getFortune() {
        //pick a random string from the array
        int index =random.nextInt(data.size());
        String theFortune = data.get(index);
        return theFortune;
    }
}
