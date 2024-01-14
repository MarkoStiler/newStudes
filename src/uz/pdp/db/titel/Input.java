package uz.pdp.db.titel;

import java.util.Scanner;

public interface Input {

    static String inputStr(String msg){
        System.out.println(msg);
        return new Scanner( System.in ).next();
    }


}
