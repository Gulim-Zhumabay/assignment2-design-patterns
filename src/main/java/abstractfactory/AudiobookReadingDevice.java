package abstractfactory;

public class AudiobookReadingDevice implements ReadingDevice{
    @Override
    public String open(){
        return "press play and listen from where you left off";
    }
}