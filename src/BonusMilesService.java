public class BonusMilesService {
    public int calculate(int cost) {
        int sumForBonus = 20;
        boolean bonus = cost >= sumForBonus;
        int mileBonus;
        if (bonus) ;
        {
            mileBonus = cost / sumForBonus * 1;
        }
        return mileBonus;
    }
}
