package patterns.template;

public class Demo {
    public static void main(String[] args) {
        CSVParse csv = new CSVParse();
        JSONParse json = new JSONParse();

        csv.getReport();
        json.getReport();
    }
}