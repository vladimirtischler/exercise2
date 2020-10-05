package com.company;

public class Triangle {
    int sizeA;
    int sizeB;
    int sizeC;
    int height;

    public Triangle(int sizeA, int sizeB, int sizeC, int height)
    {
        this.sizeA = sizeA;
        this.sizeB = sizeB;
        this.sizeC = sizeC;
        this.height = height;
    }

    public int getPerimeter(){
        return sizeA + sizeB + sizeC;
    }
    public double getArea(){
        return 0.5*sizeA*height;
    }
}
