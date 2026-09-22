package abstractfactory;

public class LibraryShelf {

    private final BookFormatFactory factory;

    public LibraryShelf(BookFormatFactory factory){
        this.factory = factory;
    }
    public void present(){
        Content content = factory.createContent();
        Bookmark bookmark =factory.createBookmark();
        ReadingDevice device = factory.createReadingDevice();

        System.out.println("format: " + content.medium());
        System.out.println("length: " + content.length());
        System.out.println("how to start: " + device.open());
                System.out.println("bookmark at 150: " + bookmark.mark(150));
    }
}
