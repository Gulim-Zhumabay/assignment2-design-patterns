package abstractfactory;

public class AudiobookBookmark implements Bookmark{

    @Override
    public String mark (int position){
        int minutes = position /60;
        int seconds = position % 60;
        return "timestamp" + minutes + ":" + String.format("%02d", seconds);
    }
}
