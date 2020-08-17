package patterns.template;

public abstract class DataParse {

    // Template method that will be called,
    // final modifier because we expect this same
    // behaviour to be repeated
    public final void getReport() {
        
        // Shared/repeated behaviour
        openFile();
        readLines();

        // Implementation specific
        processLines();
        buildReport();

        // Back to shared method
        closeFile();
    }

    // Methods that share/repeat behaviour
    public void openFile() {
        // open file
        System.out.println("Open file");
    }

    public void readLines() {
        // read lines
        System.out.println("Read lines");
    }

    public void closeFile() {
        // close file
        System.out.println("Close file");
    }


    // Abstract methods that are more implementation specific
    abstract void processLines();
    abstract void buildReport();

}