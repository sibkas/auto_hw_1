package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.Assert;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnRemainingAmount() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        Assert.assertEquals(actual, 100); // actual, expected в TestNG
    }

}
