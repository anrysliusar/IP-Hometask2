package task1;

public enum SingletonEnumImpl {
    INSTANCE;

    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
