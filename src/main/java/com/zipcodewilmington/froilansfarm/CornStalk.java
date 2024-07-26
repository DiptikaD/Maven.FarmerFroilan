package com.zipcodewilmington.froilansfarm;

public class CornStalk extends Crop implements Produce<EarCorn> {
    boolean isFertilized;

    @Override
    public boolean fertilize() {
        return isFertilized = true;
    }

    @Override
    public boolean defertilize() {
        return isFertilized = false;
    }

    @Override
    public EarCorn yield() {
        EarCorn earCorn = new EarCorn();
        return (isFertilized) ? earCorn : null;
    }
}
