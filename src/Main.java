import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        transport();
    }

    private static void transport() {
        int cartons;
        int capaCamion;
        Scanner clavier = new Scanner(System.in);
        System.out.print("Taper le nombre de cartons : ");
        cartons = clavier.nextInt();
        System.out.print("Taper la capacité du camion : ");
        capaCamion = clavier.nextInt();
//        System.out.println(cartons);
//        System.out.println(capaCamion);
        for (int i = 1; i <= cartons / capaCamion; i++) {
            int temp = cartons - (capaCamion * i);
            System.out.println("un voyage de " + temp + " cartons");
        }
        clavier.close();
    }
}


