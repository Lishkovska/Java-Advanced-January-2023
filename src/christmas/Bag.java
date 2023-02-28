package christmas;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Bag {
    private String color;
    private int capacity;
    private List<Present> data;

    public Bag(String color, int capacity) {
        this.color = color;
        this.capacity = capacity;
        data = new ArrayList<>();
    }

    public String getColor() {
        return color;
    }

    public int getCapacity() {
        return capacity;
    }

    public int count() {
        return this.data.size();
    }

    public boolean add(Present present) {
        if (this.data.size() < capacity) {
           this.data.add(present);
        }
        return false;
    }

    public boolean remove(String name) {
        return this.data.removeIf(present -> present.getName().equals(name));
    }

    public Present heaviestPresent() {
        return this.data.stream().sorted((l, r) -> Double.compare(r.getWeight(), l.getWeight()))
                .findFirst().get();
    }

    public Present getPresent(String name) {
        // return data.stream().filter(present -> present.getName().equals(name)).findFirst().get();
        for (Present present : data) {
            if (present.getName().equals(name)) {
                return present;
            }
        }
        return null;
    }


        public String report () {
            StringBuilder sb = new StringBuilder();
            //"{color of Bag} bag contains:
            sb.append(String.format("%s bag contains:%n", this.color));

            for (Present present : data) {
                sb.append(String.format("%s%n", present.toString()));
            }
            return sb.toString();
        }
    }


