

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusServiceTest {

    @Test
    public void calculates()
    {
        BonusService service=new BonusService();

        long amount=1000_60;
        boolean registered=true;

        long expected=30;

        long actual=service.calculate(amount,registered);

        assertEquals(expected,actual);
    }
}
