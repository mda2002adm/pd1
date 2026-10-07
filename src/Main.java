//TODO: musimy dodac brakujace klasy!

//OK, ja dodam 'Adder', a s36760 doda 'Substractor'

public class Main {
    public static void main(String[] args){
        Adder adder = new Adder();
        System.out.println(adder.add(1,2));

        Substractor substractor = new Substractor();

        System.out.println(substractor.substract(6, 3));
    }
}
