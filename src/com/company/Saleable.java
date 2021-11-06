package com.company;

public interface Saleable {
    Double getPrice();
    Human getOwner();
    void sell(Human buyer) throws Exception;
}
