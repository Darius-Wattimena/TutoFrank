package nl.antimeta.rekentrainer.rekenvragen;

public class Som {

    private String vraag; //1 + 9
    private int antwoord; //10

    public Som(String vraag, int antwoord) {
        this.vraag = vraag;
        this.antwoord = antwoord;
    }

    public String getVraag() {
        return vraag;
    }

    public void setVraag(String vraag) {
        this.vraag = vraag;
    }

    public int getAntwoord() {
        return antwoord;
    }

    public void setAntwoord(int antwoord) {
        this.antwoord = antwoord;
    }
}
