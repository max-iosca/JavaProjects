package com.corso.java.orangee.OtherProjectsAndTest.Euroconvertitore.remo.v2MaSarebberoClassiDiTest;

import com.corso.java.orangee.OtherProjectsAndTest.Euroconvertitore.remo.v1.EuroConvertitore;
import com.corso.java.orangee.OtherProjectsAndTest.Euroconvertitore.remo.v1.SitoCambi;
import org.junit.Assert;
import org.junit.Test;

public class EuroConvertitoreTest {

    private SitoCambi sitoCambiMocked;

    @Test
    public void convertiInEuro() {
        sitoCambiMocked = new FakeSitoCambi(2.0d);
        EuroConvertitore euroConvertitore = new EuroConvertitore(sitoCambiMocked);
        double valConvertito = euroConvertitore.convertiInEuro(10.0d, "USD");
        Assert.assertTrue("Non funziona la conversione", valConvertito==20);
    }
}