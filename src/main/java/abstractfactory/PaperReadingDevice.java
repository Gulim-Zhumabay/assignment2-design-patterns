package abstractfactory;

public class PaperReadingDevice implements ReadingDevice {

    @Override
    public String open() {
        return "open the book and start reading from the cover";
    }
}