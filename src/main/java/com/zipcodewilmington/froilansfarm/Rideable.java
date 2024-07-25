package com.zipcodewilmington.froilansfarm;

public interface Rideable<T extends Rider> {
    boolean mount(T Rider);
    boolean dismount(T Rider);
}
