package ke.co.safaricom.models;

public class Strength {

    private int id;
    private String name;
    private int score;
    private boolean deleted;

    @Override
    public String toString() {
        return "strength{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", deleted=" + deleted +
                '}';
    }

    public Strength() {
        this.deleted = false;

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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
