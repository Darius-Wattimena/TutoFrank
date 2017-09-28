package nl.antimeta.rekentrainer.ui;

import nl.antimeta.rekentrainer.model.Student;

import javax.swing.*;

public class Form1 extends BaseForm {

    private String text = "Vul hier je naam oke frank?";
    //TODO input field
    //TODO button

    public Form1() {
        setTitle("Rekentrainer - Start scherm");

        //TODO bepaal de grote van de button en input field (config)
        //TODO zet op het scherm (render)
    }

    public void process() { //Wordt aangeroepen als je op de start button clicked
        String naam = ""; //TODO value van het input field

        Student student = new Student(naam);
        //TODO start new form
    }
}
