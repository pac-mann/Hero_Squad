package ke.co.safaricom.models;

public class Squad {

    private int id;
    private String name;
    private String cause;
    private int max_size;
    private boolean deleted;

    public Squad() {
        this.deleted = false;

    }

    @Override
    public String toString() {
        return "Squad{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cause='" + cause + '\'' +
                ", max_size=" + max_size +
                ", deleted=" + deleted +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public int getMax_size() {
        return max_size;
    }

    public void setMax_size(int max_size) {
        this.max_size = max_size;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
