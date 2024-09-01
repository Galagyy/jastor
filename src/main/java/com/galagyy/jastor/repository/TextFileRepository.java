package com.galagyy.jastor.repository;

import com.galagyy.jastor.model.TextFile;

import java.io.File;
import java.io.FileOutputStream;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class TextFileRepository {
    private final String listLocation = "fileList.txt";
    private List<String> fileNames;

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

    public static void saveTextFile(TextFile textFile){

    }
}
