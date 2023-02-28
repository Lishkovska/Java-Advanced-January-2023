package kindergarten;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Kindergarten {

    private String name;
    private int capacity;
    private List<Child> registry;

    public Kindergarten(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.registry = new ArrayList<>();
    }

    public boolean addChild(Child child){
        if(registry.size() < this.capacity){
            registry.add(child);
        }
        return false;
    }

    public boolean removeChild(String firstName){
       return this.registry.removeIf(child -> child.getFirstName().equals(firstName));
    }

    public int getChildrenCount(){
        return this.registry.size();
    }

    public Child getChild(String firstName){
        return this.registry.stream().filter(child -> child.getFirstName().equals(firstName))
                .findFirst().get();
    }

    public String registryReport(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Registered children in %s:%n",this.name));

        List<Child> collect = registry.stream().sorted((a, b) -> Integer.compare(a.getAge(), b.getAge()))
                .sorted((a, b) -> a.getLastName().compareTo(b.getLastName()))
                .sorted((a, b) -> a.getFirstName().compareTo(b.getFirstName())).collect(Collectors.toList());

        for (Child child : collect) {
            sb.append("--\n");
            sb.append(String.format("%s%n", child.toString()));
        }
        return sb.toString();
    }



}
