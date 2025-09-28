package Zoo;

public class Gecko extends Animal {

    private String pattern;
    public Gecko(String name, int birthYear, String pattern) {
        super(name, birthYear);
        this.pattern = pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }
    
}