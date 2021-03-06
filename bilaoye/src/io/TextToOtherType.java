package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TextToOtherType {

    public static void main(String[] args) {
        BufferedReader bfr=null;
        BufferedWriter bfw=null;
       try {
        bfr=new BufferedReader(new FileReader("tempfile/abc.txt"));
        bfw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("tempfile/abc_utf-8.txt"), "utf-8"));
        String len=null;
        while((len=bfr.readLine())!=null){
          bfw.write(len);
          bfw.newLine();
          bfw.flush();
        }
    } catch (IOException e) {
        e.printStackTrace();
    }finally{
        if(bfr!=null){
          try {
            bfr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
        if(bfw!=null){
            try {
                bfw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

}
