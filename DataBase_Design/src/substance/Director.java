package substance;

public class Director {
    private String directorId;

    private String directorName;

    public String getDirectorId() {
        return directorId;
    }

    public void setDirectorId(String directorId) {
        this.directorId = directorId == null ? null : directorId.trim();
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName == null ? null : directorName.trim();
    }
}