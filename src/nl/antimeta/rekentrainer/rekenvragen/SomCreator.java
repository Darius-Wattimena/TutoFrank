package nl.antimeta.rekentrainer.rekenvragen;

import nl.antimeta.rekentrainer.model.Klas;

import java.util.Random;

public class SomCreator {

    public Random random = new Random(1);

    public Som getNewSom(Klas klas) {
        switch(klas) {
            case GROUP_3:
                return getGroup3Som();
            case GROUP_4:
                return getGroup4Som();
            case GROUP_5:
                return getGroup5Som();
            case GROUP_6:
                return getGroup6Som();
            case GROUP_7:
                return getGroup7Som();
            case GROUP_8:
                return getGroup8Som();
        }

        return null; //ERROR geen group
    }

    public Som getGroup3Som() {
        String vraag;
        int antwoord;

        int number1, number2;

        number1 = randomInt(1, 5);
        number2 =  randomInt(1, 5);

        vraag = number1 + " + " + number2;
        antwoord = number1 + number2;

        return new Som(vraag, antwoord);
    }

    public Som getGroup4Som() {
        return null;
    }

    public Som getGroup5Som() {
        String vraag;
        int antwoord;

        int number1, number2, somType;

        //TODO
        number1 = randomInt(1, 10);
        number2 =  randomInt(1, 5);

        somType = randomInt(1, 4);

        if (somType == 1) {
            vraag = number1 + " + " + number2;
            antwoord = number1 + number2;
        } else if (somType == 2) {
            vraag = number1 + " - " + number2;
            antwoord = number1 - number2;
        } else if (somType == 3) {
            vraag = number1 + " * " + number2;
            antwoord = number1 * number2;
        } else {
            return getRandomDeelSom(Klas.GROUP_5);
        }

        return new Som(vraag, antwoord);
    }

    public Som getGroup6Som() {
        return null;
    }

    public Som getGroup7Som() {
        return null;
    }

    public Som getGroup8Som() {
        return null;
    }

    public Som getRandomDeelSom(Klas klas) {
        //TODO logica random deel som
        String vraag = "";
        int antwoord = 0;

        return new Som(vraag, antwoord);
    }

    public int randomInt(int min, int max) {
        return random.nextInt((max - min) + 1) + min;
    }
}
