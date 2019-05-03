package com.stackroute.pe2;

import java.io.*;

public class ReadingFoldersofFileAndConvertingtoByteArray {
    public static void main(String ar[]) {
        File file1 = new File("/home/khushbu/Documents/Stackroute/Exercise2/src/java/com/stackroute/pe2");
        String[] files = file1.list();
        for (String string : files)
            System.out.println(string);


        String file2 = files[6];
        System.out.println(file2);

        InputStream is = null;
        try {
            is = new FileInputStream(file2);
            byte content[] = new byte[2 * 1024];
            int readCount = 0;
            while ((readCount = is.read(content)) > 0) {
                System.out.println(new String(content, 0, readCount - 1));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (is != null) is.close();
            } catch (Exception ex) {

            }
        }
    }
    }

