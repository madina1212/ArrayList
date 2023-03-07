import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Studet {
    private String name;
    private int age;
    private String group;

    public Studet(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public Studet() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Studet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", group='" + group + '\'' +
                '}';
    }

    public void getStudet(List<Studet> studets) {
        for (Studet s : studets) {
            System.out.println(s);
        }
    }

    public void filter(List<Studet> studets) {
        ArrayList<Studet> java = new ArrayList<>();
        ArrayList<Studet> JS = new ArrayList<>();
        for (Studet studet : studets) {
            if (studet.getGroup().equals("Java")) {
                java.add(studet);
            } else {
                JS.add(studet);
            }
        }
        java.forEach(System.out::println);
        System.out.println("------------------------------------------------------------");
        JS.forEach(System.out::println);
    }
    public void getAges(List<Studet>studets) {
        ArrayList<Studet> age = new ArrayList<>();
        ArrayList<Studet> Age = new ArrayList<>();
        for (Studet studet:studets) {
            if (studet.getAge()>19 && studet.getAge()<23){
                age.add(studet);
            }else {
                Age.add(studet);
            }
        }
        age.forEach(System.out::println);
        System.out.println("--------------------------------");
        Age.forEach(System.out::println);
    }

    public void getBukva(List<Studet> studets) {
        ArrayList<Studet> A = new ArrayList<>();
        ArrayList<Studet> B = new ArrayList<>();
        for (Studet studet : studets) {
            if (studet.getName().equals("A")) {
                A.add(studet);
            } else {
                B.add(studet);
            }
        }
        A.forEach(System.out::println);
        System.out.println("------------------------------------------------------------");
        B.forEach(System.out::println);

    }
}


