package car;

public abstract class Car {

    protected String description = "Unknown Car";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
