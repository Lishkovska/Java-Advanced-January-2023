package vetClinic;

import java.util.ArrayList;
import java.util.List;

public class Clinic {
    private int capacity;
    private List<Pet> data;

    public Clinic(int capacity) {
        this.capacity = capacity;
        data = new ArrayList<>();
    }

    public void add(Pet pet){
        if(this.data.size() < this.capacity){
            data.add(pet);
        }
    }

    public boolean remove(String name){
        return this.data.removeIf(pet -> pet.getName().equals(name));
    }

    public Pet getPet(String name, String owner){
        return this.data.stream().filter(pet -> pet.getName().equals(name) &&
                pet.getOwner().equals(owner)).findFirst().orElse(null);
    }

    public Pet getOldestPet(){

        return this.data.stream().sorted((l,r) -> Integer.compare(r.getAge(), l.getAge()))
                .findFirst().get();
    }

    public int getCount(){
        return data.size();
    }

    public String getStatistics(){
       StringBuilder sb = new StringBuilder();
       sb.append(String.format("The clinic has the following patients:%n"));

        for (Pet pet : data) {
            sb.append(String.format("%s%n",pet.toString()));
        }
        return sb.toString();
    }
}
