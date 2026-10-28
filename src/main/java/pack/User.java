import java.time.LocalDate;

public class User {
    private LocalDate time;
    private String nameCompany;
    private int weight;

    User(LocalDate time, String nameCompany, int weight) {
        this.time = time;
        this.nameCompany = nameCompany;
        this.weight = weight;
    }

    public LocalDate getTime() {
        return time;
    }
    public String getNameCompany() {
        return nameCompany;
    }
    public int getWeight() {
        return weight;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }
    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
}


