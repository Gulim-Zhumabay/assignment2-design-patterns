package abstractfactory;

public class AudiobookFactory implements BookFormatFactory {

    @Override
    public Content createContent() {
        return new AudiobookContent();
    }

    @Override
    public Bookmark createBookmark() {
        return new AudiobookBookmark();
    }

    @Override
    public ReadingDevice createReadingDevice() {
        return new AudiobookReadingDevice();
    }
}