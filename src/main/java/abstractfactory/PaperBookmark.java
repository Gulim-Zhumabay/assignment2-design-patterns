package abstractfactory;

public class PaperBookmark implements Bookmark {

    @Override
    public String mark(int position) {
        return "page " + position;
    }
}