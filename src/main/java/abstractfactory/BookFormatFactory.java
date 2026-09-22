package abstractfactory;

public interface BookFormatFactory {
    Content createContent();
    Bookmark createBookmark();
    ReadingDevice createReadingDevice();
}
