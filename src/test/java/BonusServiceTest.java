

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusServiceTest {

    @Test
     void shouldCalculatesRegisteredAndInLimit()
    {
        BonusService service=new BonusService();

        long amount=1000_60;
        boolean registered=true;

        long expected=30;

        long actual=service.calculate(amount,registered);

        assertEquals(expected,actual);
    }
    @Test
    void shouldCalculateRegisteredAndOverLimit()
    {
        BonusService service=new BonusService();

        long amount=1_000_000_60;
        boolean registered=true;

        long expected=500;

        long actual=service.calculate(amount,registered);

        assertEquals(expected,actual);
    }
    @Test
    void shouldCalculateNotRegisteredAndInLimit()
    {
        BonusService service=new BonusService();

        long amount=1000_60;
        boolean registered=false;

        long expected=10;

        long actual=service.calculate(amount,registered);

        assertEquals(expected,actual);
    }
    @Test
    void shouldCalculateNotRegisteredAndOverLimit()
    {
        BonusService service=new BonusService();

        long amount=1_000_000_60;
        boolean registered=false;

        long expected=500;

        long actual=service.calculate(amount,registered);

        assertEquals(expected,actual);
    }
    @Test
    void shouldCalculateRegisteredAndAmountZero()
    {
        BonusService service=new BonusService();

        long amount=0;
        boolean registered=false;

        long expected=0;

        long actual=service.calculate(amount,registered);

        assertEquals(expected,actual);
    }

}
