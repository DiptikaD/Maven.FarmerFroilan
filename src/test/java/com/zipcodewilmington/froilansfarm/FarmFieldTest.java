package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class FarmFieldTest {

    @Test
    public void testFarmFieldConstructor (){
        ArrayList<CropRow> cropRows = new ArrayList<>();
        CropRow cropRow = new CropRow();
        Tomato tomato = new Tomato();
        cropRow.add(tomato);
        cropRows.add(cropRow);

        FarmField farmField = new FarmField();
        FarmField farmFieldWithTomato = new FarmField(cropRows);

        Assert.assertFalse(farmField == farmFieldWithTomato);
    }

    @Test
    public void testFarmFieldEmptyConstructor (){
        FarmField farmField = new FarmField();

        Assert.assertEquals(0, farmField.size());
    }


}
