import java.util.List;

public class Second {
    private String name;
    private List<Third> seconds;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Third> getSeconds() {
        return seconds;
    }

    public void setSeconds(List<Third> seconds) {
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return "Second{" +
                "name='" + name + '\'' +
                ", seconds=" + seconds +
                '}';
    }
}
