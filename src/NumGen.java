import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * Created by Manu on 18-May-16.
 */
public class NumGen {
    public Set numere() {
        Random lottoMachine = new Random();
        lottoMachine.setSeed(System.currentTimeMillis());
        // 2 generate the lotto numbers
        Set setofSix = null;
        setofSix = new HashSet<Integer>();
        int counter1 = 0;
        do {
            int nr = lottoMachine.nextInt(49) + 1;
            boolean success = setofSix.add(nr);
            if (success) { // nr not already in the set
                counter1++;
                System.out.print(nr + ":");
            }
        }
        while (counter1 < 6);
        return setofSix;
    }
}
