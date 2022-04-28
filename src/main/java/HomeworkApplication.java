import java.util.*;

public class HomeworkApplication {
    public static void main(String[] args) {
        FirstMethod();
        SecondMethod();
    }

    private static void FirstMethod() {
        String[] arr = {"Hello", "Hola", "Hallo", "Barev", "Aloha", "Hej", "Salute", "Labas", "Moien",
                "Salut", "Salom", "Terve", "Namaste", "Ahoj", "Aloha", "Salute", "Labas", "Konnichiwa"};
        Set<String> wordsArray = new LinkedHashSet<>(List.of(arr));
        System.out.println(wordsArray);
        System.out.println(wordsArray.size());
    }

    private static void SecondMethod(){
        HashMap<String, String> tn = new HashMap<>();
        add(tn,"Ivanov", "+79263242106");
        add(tn,"Smirnov", "+79263242107");
        add(tn, "Kyznechov", "+79263242108");
        add(tn,"Popov", "+79263242109");
        add(tn,"Vasiliev", "+79263242110");
        add(tn, "Petrov", "+79263242111");
        add(tn,"Sokolov", "+79263242112");
        add(tn,"Mihailov", "+79263242113");
        add(tn, "Novikov", "+79263242114");
        add(tn,"Fedorov", "+79263242104");
        add(tn,"Morozov", "+79263242105");
        add(tn, "Ivanov", "+79263242103");
        add(tn, "Vasiliev", "+79263242102");
        get(tn, "Ivanov");
        get(tn, "Smirnov");
        get(tn, "Kyznechov");
        get(tn, "Popov");
        get(tn, "Vasiliev");
        get(tn, "Petrov");
        get(tn, "Sokolov");
        get(tn, "Mihailov");
        get(tn, "Novikov");
        get(tn, "Fedorov");
        get(tn, "Morozov");

    }

    private static void add(HashMap<String, String> tn, String name, String phoneNumber){
        if (tn.containsKey(name)) {
            tn.put(name, tn.get(name) + ", " + phoneNumber);
        } else tn.put(name, phoneNumber);
    }

    private static void get(HashMap<String, String> tn, String name) {
        System.out.printf("%s = %s\n", name, tn.get(name));
    }

}
