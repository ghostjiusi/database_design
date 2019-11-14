package substance;

public class WriterKey {
    private String writerId;

    private String writerName;

    public String getWriterId() {
        return writerId;
    }

    public void setWriterId(String writerId) {
        this.writerId = writerId == null ? null : writerId.trim();
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName == null ? null : writerName.trim();
    }
}