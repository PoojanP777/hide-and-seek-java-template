package org.example;

public class Fuzzy {
    String color;

    public Fuzzy(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Fuzzy fuzzy = (Fuzzy) obj;
        return color.equals(fuzzy.color);
    }
}

