package com.salil.example.springquartz;

import java.io.*;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-5-15
 * Time: 上午8:28
 * To change this template use File | Settings | File Templates.
 */
public class TestFile {


    public static void operateFile(String path){

        File file = new File(path);
        if(file.exists()){
            appendFile(file);
        }else {
            try {
                FileOutputStream fos = new FileOutputStream(file);
                fos.close();
                System.out.println("创建文件成功" );
                appendFile(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void appendFile(File file){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));
            bw.write("schedule :" + new Date().toString());
            bw.newLine();
            bw.flush();
            bw.close();
            System.out.println("add success :"+new Date().toString() );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   public static void main(String[] arg){
          operateFile("G:\\test.txt");
   }
}
