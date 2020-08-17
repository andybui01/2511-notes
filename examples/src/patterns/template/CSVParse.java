package patterns.template;

public class CSVParse extends DataParse {
    @Override
    void processLines() {
        // process CSV lines
        System.out.println("processing CSV lines");
    }

    @Override
    void buildReport() {
        // build report from CSV data
        System.out.println("building report from CSV");
    }
}