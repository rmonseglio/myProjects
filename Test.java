package com.richardmonseglio;
/**
 * 
 * @author Coding.Troll(Richard Monseglio)
 *
 */
public class Test {

	public static void main(String[] args) {
		Sphere one = new Sphere();
		System.out.println(one.getRadius() + "\nThe diameter is: " +  one.diameter() + "\nThe circumference is: "+ one.Circumference()
		+ "\nThe surface area is: " + one.surfaceArea() + "\nThe Volume is: " + one.Volume());

	}

}
