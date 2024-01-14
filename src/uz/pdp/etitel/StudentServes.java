package uz.pdp.etitel;

import uz.pdp.db.StudentRepo;
import uz.pdp.db.titel.Input;

import java.util.List;
import java.util.Optional;

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
        Studen studen = getStudent();
        String name = Input.inputStr( "Yangi : ismini kriting " );
        int age = Input.inputInt( "Yangi : yoshini kriting " );
        STUDENT_REPO.update( studen,name,age );
    }

    private static Studen getStudent() {
        List<Studen> studens = STUDENT_REPO.read();
        for (Studen studen : studens) {
            System.out.println(studen);
        }
        int id = Input.inputInt( "id : kriting" );
            if (studens.get( id ).getId().equals( id )){
                return studens.get( id );
            }
        return getStudent();

    }

    public static void Ochirish() {
    }
}
