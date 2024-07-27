package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class CropRowTest {

    @Test
    public void testCropRowAdd(){
        Tomato tomato = new Tomato();
        CropRow cropRow = new CropRow();
        cropRow.add(tomato);
        Assert.assertTrue(cropRow.contains(tomato));
    }

    @Test
    public void testCropConstructor(){
        CropRow cropRow = new CropRow();
        Assert.assertEquals(cropRow.size(), 0);
    }

    @Test
    public void testAllConstructor() {
        ArrayList<Crop> crops = new ArrayList<>();
        crops.add(new CornStalk());

        CropRow actual = new CropRow(crops);
        Assert.assertEquals(actual.size(), 1);

    }


    @Test
    public void testGetCropRow(){
        ArrayList<Crop> crops = new ArrayList<>();
        CornStalk cornStalk = new CornStalk();
        crops.add(cornStalk);

        CropRow cropRow = new CropRow(crops);
        Assert.assertEquals(1, cropRow.size() );


    }
}
