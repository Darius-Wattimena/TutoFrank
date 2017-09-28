package nl.antimeta.rekentrainer.model;

/**
 * Created by DariusPC on 28-9-2017.
 */
public class Student {

    private String name;
    private Klas klas = Klas.NONE;

    public Student(String name) {
        this.name = name;
    }

    public Klas getKlas() {
        return klas;
    }

    public void setKlas(Klas klas) {
        this.klas = klas;
    }

    public String getName() {
        return name;
    }
}
