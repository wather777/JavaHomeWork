/**
 * Created by s_chernykh on 19.04.2017.
 */

import java.io.*;
import java.util.*;

public class PhoneBook {
    public static void main(String[] args) throws IOException {
        Properties ht =new Properties();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String name, number;
        FileInputStream fin = null ;
        boolean changed = false;

        try {
            fin=new FileInputStream("d:/phn.dat");
        }catch (FileNotFoundException e){}


        try{
            if(fin !=null){
                ht.load(fin);
                fin.close();
            }
        }catch (IOException e){
            System.out.println("file read error");
        }


        do{
            System.out.println("Enter name"+"('Exit' to stop'): ");

            name = br.readLine();
            if(name.equals("exit")) continue;
            System.out.println("Enter number: ");
            number=br.readLine();

            ht.put(name,number);
            changed = true;

        }while (!name.equals("exit"));

        if(changed) {
            FileOutputStream fout = new FileOutputStream("d:/phn.dat");
            ht.store(fout,"phonebook");
            fout.close();
        }


        do {
            System.out.println("Enter name to search:"+"('Exit' to stop'): ");
            name=br.readLine();
            if(name.equals("exit"))continue;
            number=(String) ht.get(name);
            System.out.println(number);
        }while (!name.equals("exit"));
    }
}
