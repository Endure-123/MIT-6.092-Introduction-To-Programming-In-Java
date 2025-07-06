package Lecture;

public class GrandWizard extends Wizard {
    public void sayName() {
        System.out.println("Grand wizard:" + name);
    }

    public static void main(String[] args) {
        GrandWizard grandWizard1 = new GrandWizard();
        grandWizard1.name = "Flash";
        grandWizard1.sayName();
        ((Dude) grandWizard1).sayName();
    }
}
