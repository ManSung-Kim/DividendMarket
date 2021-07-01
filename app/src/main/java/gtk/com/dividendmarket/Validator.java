package gtk.com.dividendmarket;

public class Validator {
    public boolean validateInput(int amount, String contents) {
        return (amount > 0 && !contents.isEmpty());
    }
}
