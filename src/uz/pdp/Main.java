package uz.pdp;

import uz.pdp.db.titel.Input;
import uz.pdp.etitel.StudentServes;

public class Main {
    public static void main(String[] args) {

        while (true){
            System.out.println( """
                    1. Student qoshi
                    2. Student korish
                    3. Student ozgartirish
                    4. Student ochirish
                    """);
            switch (Input.inputInt( "Tanlang : " )){
                 case 1 -> StudentServes.Qoshi();
                 case 2 -> StudentServes.Korish();
                 case 3 -> StudentServes.Ozgartirish();
                 case 4 -> StudentServes.Ochirish();
            }
        }

    }
}