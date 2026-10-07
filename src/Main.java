//TODO: musimy dodac brakujace klasy!

//OK, ja dodam 'Adder', a s36760 doda 'Substractor'

public class Main {
    public static void main(String[] args){
        Adder adder = new Adder();
        System.out.println(adder.add(1,2));

        Subtractor substractor = new Subtractor();

        System.out.println(substractor.subtract(6, 3));
    }
}
