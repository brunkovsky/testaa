import java.util.List;

public class First {
    private String name;
    private List<Second> seconds;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Second> getSeconds() {
        return seconds;
    }

    public void setSeconds(List<Second> seconds) {
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return "-First{" +
                "name='" + name + '\'' +
                ", seconds=" + seconds +
                '}';
    }
}
