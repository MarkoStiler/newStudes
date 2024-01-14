package uz.pdp.etitel;

import uz.pdp.db.StudentRepo;
import uz.pdp.db.titel.Input;

public class StudentServes {

    private static StudentRepo STUDENT_REPO = StudentRepo.getInstance();
    public static void Qoshi() {
        Studen studen = new Studen(
                Input.inputStr( "Ismizi kriting :" ),
                Input.inputInt( "Yoshigizni kriting" )
        );
        STUDENT_REPO.create( studen );
    }

    public static void Korish() {
        for (Studen studen : STUDENT_REPO.read()) {
            System.out.println(studen);
        }
    }

    public static void Ozgartirish() {
    }

    public static void Ochirish() {
    }
}
