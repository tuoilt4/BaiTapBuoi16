
public class CheckException extends Exception{
    public CheckException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Lỗi: " + super.getMessage();
    }
}