package org.vistula.listy;

import java.util.ArrayList;// tu są zaimportowane 2 klasy: List i ArrayList
import java.util.List;

public class VistulaList {

    List<String> imiona = new ArrayList<>();
    public VistulaList()    {
    }

    public List<String> getImiona() {
        return imiona;
    }

    public void setImiona(List<String> imiona) {
        this.imiona = imiona;
    }
}
