import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Studet> studets = new ArrayList<>();
        studets.add(new Studet("Madina",16,"Java"));
        studets.add(new Studet("Aigerim",17,"JS"));
        studets.add(new Studet("Kanykri",18,"Java"));
        studets.add(new Studet("Arzuu",20,"JS"));
        studets.add(new Studet("Ulan",30,"Java"));
        studets.add(new Studet("Datka",21,"Java"));
        studets.add(new Studet("Alibek",22,"JS"));
        studets.add(new Studet("Aijamal",25,"JS"));
        studets.add(new Studet("Altynbek",19,"Java"));
        studets.add(new Studet("Syimyk",23,"Java"));

        Studet studet = new Studet();
//        studet.getStudet(studets);
//        studet.getAges(studets);
//        studet.getBukva(studets);
        studet.filter(studets);

    }
}