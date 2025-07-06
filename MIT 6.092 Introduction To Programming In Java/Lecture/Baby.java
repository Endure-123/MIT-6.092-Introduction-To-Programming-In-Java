package Lecture;

public class Baby {

    String name;

    static void cry(Baby thebaby) {
        System.out.println(thebaby.name + "cries");
    }

    public static void main(String[] args) {
        Baby Wang = new Baby();
        Wang.name = "Wangwentao";
        cry(Wang);
    }
}