package kata4.view;

import java.io.BufferedReader;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kata4.model.Mail;

public class MailListReader {

    public static List<Mail> read(String fileName) {

        List<Mail> list = new ArrayList<>();
    
        try{
            Scanner reader = new Scanner(new BufferedReader(
                    new FileReader(new File(fileName))));
            while(reader.hasNext()){
                String line = reader.next();
                if(Mail.isMail(line))
                    list.add(new Mail(line));
            }
            /*IteratorReader reader = new IteratorReader
                (new BufferedReader(new FileReader(new File(fileName))));
            for (String line : reader) {
                list.add(new Mail(line));
            }
            */
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        return list;
    }

}
