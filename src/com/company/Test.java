package com.company;

public class Test {
  private  int godVypuska;
  private  String model;
  private  int prise;
  private  String color;

    public Test(int godVypuska, String model, int prise, String color) {
        this.godVypuska = godVypuska;
        this.model = model;
        this.prise = prise;
        this.color = color;
    }

    public int getGodVypuska() {
        return godVypuska;
    }

    public void setGodVypuska(int godVypuska) {
        this.godVypuska = godVypuska;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Test{" +
                "godVypuska=" + godVypuska +
                ", model='" + model + '\'' +
                ", prise=" + prise +
                ", color='" + color + '\'' +
                '}';
    }


}
