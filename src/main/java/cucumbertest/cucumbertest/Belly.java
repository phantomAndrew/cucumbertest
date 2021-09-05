package cucumbertest.cucumbertest;

public class Belly {
    private int contents;

    public Belly() {
        this.contents = 0;
    }

    public void eats(int cukes) {
        contents = contents + cukes;

    }
}
