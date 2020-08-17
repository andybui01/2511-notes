package patterns.builder;

public class Car {

    private String frontWing;
    private String rearWing;
    private String drs;
    private String kers;

    public void setFrontWing(String string) {
        frontWing = string;
    }

    public void setRearWing(String string) {
        rearWing = string;
    }

    public void setDRS(String string) {
        drs = string;
    }

    public void setKERS(String string) {
        kers = string;
    }

    public String getCar() {
        return String.join(" + ", frontWing, rearWing, drs, kers);
    }
}