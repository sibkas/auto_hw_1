package ru.netology.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnRemainingAmount() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        assertEquals(100, actual);
    }
}
