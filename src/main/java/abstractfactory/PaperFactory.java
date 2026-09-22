package abstractfactory;

public class PaperFactory implements BookFormatFactory {

    @Override
    public Content createContent() {
        return new PaperContent();
    }

    @Override
    public Bookmark createBookmark() {
        return new PaperBookmark();
    }

    @Override
    public ReadingDevice createReadingDevice() {
        return new PaperReadingDevice();
    }
}