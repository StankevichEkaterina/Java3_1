public class Main {
    public static void main(String[] args) {

        //входные данные

        int ticketPrice = 100;
        int sumForBonus = 20;
        boolean bonus = ticketPrice >= sumForBonus;


        //логика программы
        int mileBonus;
        if (bonus) ;
        {
            mileBonus = ticketPrice / sumForBonus * 1;
        }
        System.out.println("Начисленные мили: " + mileBonus);
    }
}
