package nl.antimeta.rekentrainer.rekenvragen;

import nl.antimeta.rekentrainer.model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Vragen {

    private Student student;
    private boolean doorElkaar;
    private int aantalVragen;

    private SomCreator somCreator = new SomCreator();

    private List<Som> vragen;

    public Vragen(Student student, boolean doorElkaar, int aantalVragen) {
        this.student = student;
        this.doorElkaar = doorElkaar;
        this.aantalVragen = aantalVragen;

        vragen = new ArrayList<>(aantalVragen);
    }

    public void generateVragen() {
        for (int i = 0; i < aantalVragen; i++) {
            vragen.add(somCreator.getNewSom(student.getKlas()));
        }

        if (doorElkaar) {
            Collections.shuffle(vragen);
        }
    }

    public List<Som> getVragen() {
        return vragen;
    }
}
