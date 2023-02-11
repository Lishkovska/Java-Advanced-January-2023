package iteratorsComparators.StrategyPatternsExercise_06;

import java.util.Comparator;

public class ComparatorByAge implements Comparator<Person> {
    @Override
    public int compare(Person first, Person second) {
        return first.getAge()-second.getAge();
    }
}
