package be.ehb.jokerapp.model;

public class Joke {

    private String setup;
    private String punchLine;

    public Joke(String setup, String punchLine) {
        this.setup = setup;
        this.punchLine = punchLine;
    }

    public String getSetup() {
        return setup;
    }

    public void setSetup(String setup) {
        this.setup = setup;
    }

    public String getPunchLine() {
        return punchLine;
    }

    public void setPunchLine(String punchLine) {
        this.punchLine = punchLine;
    }
}
