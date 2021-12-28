package com.company;

public class AdditionalTemperature {
    private double tempKelvin;

    public AdditionalTemperature(double temp) {
        this.tempKelvin=temp;
    }

    public void setTempKelvin(double temp) {
        this.tempKelvin=temp;
    }

    public void setTempFahrenheit(double temp) {
        this.tempKelvin=temp+273.15;
    }

    public void setTempFahrenheit1(double temp) {
        this.tempKelvin=(temp-32)*5/9.0+273.15;
    }

}
