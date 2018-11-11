package BehavioralDesignPatterns.CommandPattern;

public interface FileSystemReceiver {

    void openFile();
    void writeFile();
    void closeFile();
}
