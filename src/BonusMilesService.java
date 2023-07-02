public class BonusMilesService {
    public int calculate(int price) {
        int rate = 20; // количество рублей за милю

        int result = price / rate; // результат
        return result;
    }
}
