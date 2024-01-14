package uz.pdp.etitel;

import java.io.Serializable;

public class Studen implements Serializable {

    private int sum = 1;
    private Integer id = sum+1;
    private String name;
    private int age;

    public Studen(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Studen{" +
                " id="+id+
                " name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
