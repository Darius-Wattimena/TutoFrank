package nl.antimeta.rekentrainer;

import nl.antimeta.rekentrainer.model.Klas;
import nl.antimeta.rekentrainer.model.Student;
import nl.antimeta.rekentrainer.rekenvragen.Vragen;

public class Main {

    public static void main(String[] args) {
        Student darius = new Student("Darius");
        darius.setKlas(Klas.GROUP_5);
        new Vragen(darius, true, 10).generateVragen();
    }
}
