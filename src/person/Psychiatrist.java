package person;

public class Psychiatrist extends Doctor{
    final private String specialization;

    public Psychiatrist(String name, String address, String sex, int age){
        super(name, address, sex, age);
        specialization = "Psychiatry";
        can_cure.add("Depression");
        can_cure.add("Anxiety");
        can_cure.add("Bipolar Disorder");
        can_cure.add("Paranoia");
        can_cure.add("Schizophrenia");
        can_cure.add("Delirium");
        can_cure.add("Dependence");
        can_cure.add("Anorexia");
    }

    public String getSpecialization() {
        return specialization;
    }
}
