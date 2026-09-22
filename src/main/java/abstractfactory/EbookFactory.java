package abstractfactory;

public class EbookFactory implements BookFormatFactory {

    @Override
    public Content createContent() {
        return new EbookContent();
    }

    @Override
    public Bookmark createBookmark() {
        return new EbookBookmark();
    }

    @Override
    public ReadingDevice createReadingDevice() {
        return new EbookReadingDevice();
    }
}