package pms.infrastructure;

public class Toggle {
    private String name;
    private Boolean active;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Toggle{" +
                "name='" + name + '\'' +
                ", active=" + active +
                '}';
    }
}
