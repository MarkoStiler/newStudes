package uz.pdp.db;

import uz.pdp.etitel.Studen;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepo implements Repositore<Studen>,Serializable{

    private List<Studen> list;
    private static StudentRepo studentRepo;
    private static String PACH = "src/uz/pdp//db/student_db.txt";
    public StudentRepo(List<Studen> list) {
        this.list = list;
    }


    public static StudentRepo getInstance(){
        if(studentRepo==null){
            studentRepo= new StudentRepo( LoadData());
        }
        return studentRepo;
    }

    @SuppressWarnings( "unchecked" )
    public static List<Studen> LoadData() {
        try (
                InputStream inputStream = new FileInputStream(PACH);
                ObjectInputStream objectInputStream = new ObjectInputStream( inputStream );
        ) {
            return (List<Studen>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }


    @Override
    public void create(Studen studen) {
    list.add( studen );
    LoadAdd();
    }

    private void LoadAdd() {
        try(
                OutputStream outputStream = new FileOutputStream( PACH );
                ObjectOutputStream objectOutputStream = new ObjectOutputStream( outputStream );
        ) {
                objectOutputStream.writeObject( list );
        } catch (IOException e) {
            throw new RuntimeException( e );
        }


    }

    @Override
    public void update(Studen studen,String name,int age) {
    studen.setName( name );
    studen.setAge( age );
    LoadAdd();
    }

    @Override
    public void delete(Studen studen) {
    list.remove( studen );
    }

    @Override
    public List<Studen> read() {
        return list;
    }

}
