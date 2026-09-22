package abstractfactory;

public class EbookReadingDevice implements ReadingDevice{
    @Override
    public String open(){
        return "open the app and continue from the last synced page";
    }
}
