package abstractfactory;

public class EbookBookmark implements Bookmark {

    @Override
    public String mark (int position) {
        return "synced position" + position;
    }
}
