/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ue.area;

/**
 *
 * @author User
 */

public class CIRCLE {
    private final double radius;
    private  final double pi = 22.0 / 7.0;

    public CIRCLE(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return pi * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * pi * radius;
    }
}

