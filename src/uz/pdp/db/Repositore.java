package uz.pdp.db;

import uz.pdp.etitel.Studen;

import java.util.List;

public interface Repositore<T> {

    void create(T t);
    void update(Studen studen,String name,int age);
    void delete(Studen studen);
    List<Studen> read();

}
