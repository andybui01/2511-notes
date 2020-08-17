package patterns.template;

public class JSONParse extends DataParse {
    @Override
    void processLines() {
        // Process JSON lines
        System.out.println("processing JSON lines");
    }

    @Override
    void buildReport() {
        // Build report from JSON data
        System.out.println("building report from JSON data");
    }
}