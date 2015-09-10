package com.twp.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ImportedGoodsTest {

    @Test
    public void shouldHaveAnImportDutyOfFivePercent() {
        ImportedGoods importedGoods = new ImportedGoods(8.98);

        assertEquals(0.449, importedGoods.importDuty(), 0.0001);
    }
}
