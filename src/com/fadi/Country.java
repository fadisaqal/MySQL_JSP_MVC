package com.fadi;

import java.io.Serializable;

/**
 * Created by Fadi on 02-May-17.
 */


public class Country implements Serializable {
    String abbr;
    String name;

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.abbr.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Country() {
    }

    public String getAbbr() {
        return abbr;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
