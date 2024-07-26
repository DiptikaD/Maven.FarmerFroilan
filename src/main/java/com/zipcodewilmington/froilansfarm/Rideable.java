package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public interface Rideable<T extends Rider> {
    boolean mount(T Rider);
    boolean dismount(T Rider);
}
