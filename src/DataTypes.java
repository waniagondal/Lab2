import java.util.ArrayList;
import java.util.List;

public class DataTypes {
    public static long sum(List<Integer> numbers) {
        long s = 0;
        for (int x : numbers) {
            s += x;
        }
        return s;
    }
}