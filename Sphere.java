package com.richardmonseglio;

import java.util.Scanner;

/**
 * 
 * @author Coding.Troll(Richard Monseglio)
 *
 *	volume of a sphere: v = 4/3*pi*(r*r)
 *	surface area of a sphere: A = 4*pi*(r*r)
 *	circumference of a sphere: C = 6.2832*r
 *	Diameter of a sphere: D = 2*r
 */
public class Sphere {
	private double radius;
	private double Diameter;
	private double Circumference;
	private double surfaceArea;
	private double Volume;
	public double Pi = 3.141592653589793238;
	public double cir = 6.2832;
	// constructor
	public Sphere() {
		
	}
	/**
	 * @return the radius
	 */
	public double getRadius() {
		System.out.println("Enter the radius: ");
		Scanner read = new Scanner(System.in);
		radius = read.nextDouble();
		return radius;
	}
	
	public double diameter() {
		// Diameter of a sphere: D = 2*r
		return Diameter = 2.0 * radius;
	}
	public double Circumference() {
		// circumference of a sphere: C = 6.2832*r
		return Circumference = cir * radius;
	}
	public double surfaceArea() {
		// surface area of a sphere: A = 4*pi*(r*r)
		return surfaceArea = 4 * Pi * (radius * radius);
	}
	public double Volume() {
		// volume of a sphere: v = 4/3*pi*(r*r)
		return Volume = (4/3) * Pi * (radius * radius);
	}

	

	
	
	
	
}
