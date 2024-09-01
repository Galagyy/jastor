package com.galagyy.jastor.repository;

import com.galagyy.jastor.model.TextFile;

import java.io.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class TextFileRepository {
    private final String listLocation = "fileList.txt";
    private final List<String> fileNames;

    public TextFileRepository() throws Exception{
        fileNames = new ArrayList<>();
        File listFile = new File(listLocation);

        if(listFile.exists() && !listFile.isDirectory()) {
            Scanner fileScanner  = new Scanner(listFile);

            while(fileScanner.hasNextLine()) {
                fileNames.add(fileScanner.nextLine());
            }

            return;
        }

        listFile.createNewFile();
    }

    public void saveTextFile(TextFile textFile, String name) throws Exception{
        if(fileNames.contains(name)){
            throw new Exception("There is already a file named \"" + name + "\".");
        }

        if(!name.endsWith(".txt")){
            throw new Exception("The file named \"" + name + "\" does not have the \".txt\" suffix.");
        }

        fileNames.add(name);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(name));
        out.writeObject(textFile);
        out.flush();
        out.close();
    }

    public TextFile readTextFile(String name) throws Exception{
        if(fileNames.contains(name)){
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(name));
            TextFile textFile = (TextFile) in.readObject();
            in.close();

            return textFile;
        }

        throw new Exception("A file with filename \"" + name + "\" does not exist.");
    }
}
