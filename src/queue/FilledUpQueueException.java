package queue;

public class FilledUpQueueException extends RuntimeException {
    public FilledUpQueueException(String message) {
        super(message);
    }
}
