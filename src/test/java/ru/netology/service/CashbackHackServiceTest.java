package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.Assert;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnRemainingAmountWhenLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        Assert.assertEquals(actual, 100); 
    }

    @Test
    public void shouldReturnZeroWhenAmountIsExactlyBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        Assert.assertEquals(actual, 0);
    }

    @Test
    public void shouldReturnRemainingAmountWhenMoreThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1150);
        Assert.assertEquals(actual, 850);
    }

    @Test
    public void shouldReturnFullBoundaryWhenAmountIsZero() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        Assert.assertEquals(actual, 1000);
    }
}
