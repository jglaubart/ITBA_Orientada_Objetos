package Parcial1.P22_04_21.Ej3_Expenses;

public class ExpensesTester {
    public static void main(String[] args) {
        // Obtengo un nuevo consorcio con los valores por defecto
        // $100 = Costo por metro cuadrado U.F. Residencial y Comercial
        // 3.0  = Multiplicador U.F. Comercial
        // $200 = Cargo extra por ambiente U.F. Residencial
        Building building = new Building();
        System.out.println("----------");

        // Obtengo una U.F. Residencial de nombre "101", de 35 m2 y 2 ambientes
        FunctionalUnit aHouse = building.newResidentialFunctionalUnit("101", 35, 2);
        System.out.println("----------");

        // Expensas para 101 = (35m2 * $100) + (2amb * $200) = 3500 + 400 = $3900
        System.out.println(aHouse);
        System.out.println("----------");

        // $150 = Costo por metro cuadrado U.F. Residencial y Comercial
        building.setM2Expense(150.0);
        System.out.println("----------");

        // Expensas para 101 = (35m2 * $150) + (2amb * $200) = 5250 + 400 = $5650
        System.out.println(aHouse);
        System.out.println("----------");

        // Obtengo una U.F. Comercial de nombre "C70", de 20 m2
        FunctionalUnit aStore = building.newCommercialFunctionalUnit("C70", 20);
        System.out.println("----------");

        // Expensas para C70 = (20m2 * $150) * 3 = 3000 * 3 = $9000
        System.out.println(aStore);
        System.out.println("----------");

        // $400 = Cargo extra por ambiente U.F. Residencial
        building.setResidentialRoomExpense(400.0);
        System.out.println("----------");

        // Expensas para 101 = (35m2 * $150) + (2amb * $400) = 5250 + 800 = $6050
        System.out.println(aHouse);
        System.out.println("----------");

        // Expensas para C70 = (20m2 * $150) * 3 = 3000 * 3 = $9000
        System.out.println(aStore);
        System.out.println("----------");

        // 5.0  = Multiplicador U.F. Comercial
        building.setCommercialMult(5.0);
        System.out.println("----------");

        // Expensas para C70 = (20m2 * $150) * 5 = 3000 * 5 = $15000
        System.out.println(aStore);
    }
}

//SALIDA:

//----------
//        ----------
//Residencial: U.F. 101 ( 35 m2 ) : $3900.00
//        ----------
//        ----------
//Residencial: U.F. 101 ( 35 m2 ) : $5650.00
//        ----------
//        ----------
//Comercial: U.F. C70 ( 20 m2 ) : $9000.00
//        ----------
//        ----------
//Residencial: U.F. 101 ( 35 m2 ) : $6050.00
//        ----------
//Comercial: U.F. C70 ( 20 m2 ) : $9000.00
//        ----------
//        ----------
//Comercial: U.F. C70 ( 20 m2 ) : $15000.00

