package ru.netology.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnRemainingAmountWhenLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        assertEquals(100, actual);
    }

    @Test
    public void shouldReturnZeroWhenAmountIsExactlyBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        assertEquals(0, actual);
    }

    @Test
    public void shouldReturnRemainingAmountWhenMoreThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1150);
        assertEquals(850, actual);
    }

    @Test
    public void shouldReturnFullBoundaryWhenAmountIsZero() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        assertEquals(1000, actual);
    }
}
