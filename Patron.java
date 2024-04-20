public class Patron {
    private String name;
    private int id;

    public Patron(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id;
    }
}
