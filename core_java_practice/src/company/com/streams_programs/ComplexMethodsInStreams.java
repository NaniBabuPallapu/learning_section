package company.com.streams_programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


class Avenger {
    private Long id;
    private String character;
    private String team;

    public Avenger(Long id, String character, String team) {
        this.id = id;
        this.character = character;
        this.team = team;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Avenger{" +
                "id=" + id +
                ", character='" + character + '\'' +
                ", team='" + team + '\'' +
                '}';
    }
}

public class ComplexMethodsInStreams {
    public static void main(String[] args) {


        // 1. Collectors.joining();
        List<String> items1 = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        String value = items1.stream()
                .collect(Collectors.joining(" , "));
        System.out.println(value);

        /**
         *         Collectors.groupingBy() - It is used to group objects in a stream by a property or key and collect them into a Map.
         *         Collectors.groupingBy(classifier)
         *         Collectors.groupingBy(classifier, downstream)
         *         Collectors.groupingBy(classifier, supplier, downstream)
         *         classifier – function to group elements by (e.g., Function.identity(), Person::getCity)
         *
         *         downstream – another collector (like toList(), counting(), mapping())
         *
         *         supplier – the type of Map you want (e.g., LinkedHashMap::new)
         */

        //  2. Collectors.groupingBy(classifier)
        List<String> items2 = Arrays.asList("apple", "banana", "grape", "avocado", "lime", "apple", "orange", "banana");

        //ex 1: Grouping Strings By their value
        Map<String, List<String>> listMap = items2.stream()
                .collect(Collectors.groupingBy(Function.identity()));
        System.out.println(listMap);

        //ex 2:  Group by length of strings
        Map<Integer, List<String>> integerListMap = items2.stream().collect(Collectors.groupingBy(element -> element.length()));
        System.out.println(integerListMap);

        //ex 3: Group and Count
        Map<String, Long> itemsWithCount = items2.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(itemsWithCount);

        System.out.println("\n");

        List<Avenger> avengers = Arrays.asList(
                new Avenger(1L, "Nani", "CaptainTeam"),
                new Avenger(2L, "Steve", "CaptainTeam"),
                new Avenger(3L, "Thor", "Others"),
                new Avenger(4L, "Iron Man", "IronManTeam"),
                new Avenger(5L, "Wanda", "IronManTeam"),
                new Avenger(6L, "Star Lords", "GalaxyTeam"),
                new Avenger(7L, "Ant Man", "CaptainTeam"),
                new Avenger(9L, "Spider man", "IronManTeam"),
                new Avenger(10L, "Black Widow", "IronManTeam"),
                new Avenger(11L, "Groot", "GalaxyTeam"),
                new Avenger(12L, "Hulk", "Others")
        );
        //ex 4: Group Custom Objects(Employee) by Property ==> team name = avengers with their full details those who are in this team name
        Map<String, List<Avenger>> teams = avengers.stream()
                .collect(Collectors.groupingBy(Avenger::getTeam));
        for (Map.Entry<String, List<Avenger>> team : teams.entrySet()) {
            System.out.println(team.getKey() + " = " + team.getValue());
        }

        System.out.println("\n");

        //ex 5:  Group and Transform (mapping downstream) ==> team name = avengers with their characterName only those who are in this team name
        Map<String, List<String>> teamAndMembers = avengers.stream()
                .collect(Collectors.groupingBy(Avenger::getTeam, Collectors.mapping(Avenger::getCharacter, Collectors.toList())));

        for (Map.Entry<String, List<String>> teamAndMember : teamAndMembers.entrySet()) {
            System.out.println(teamAndMember.getKey() + " = " + teamAndMember.getValue());
        }

    }
}
