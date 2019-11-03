package pms.api;

public class Message{
    private String Message;

    public Message(String message) {
        this.Message = message;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
