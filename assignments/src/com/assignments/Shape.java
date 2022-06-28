package com.assignments;

import java.util.Scanner;
//area of circle = Math.PI*radius*radius
//area of Triangle = 1/2*height*base
//area of Rectangle =length*width

abstract public class Shape {
	

	public abstract void printArea();
	char key;

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("===========================================");
		System.out.println("WELCOM TO SHAPE APP:");
		System.out.println("===========================================");
		char key;
		do
		{
		System.out.println("===========================================");
		System.out.println("PLEASE MAKE A SELACTION FROM OPTIONS BELOW: ");
		System.out.println("===========================================");
		
		System.out.println("Select  1 to Calculate Area of a Rectangle.");
		System.out.println("Select  2 to Calculate Area of a Triangle.");
		System.out.println("Select  3 to Calculate Area of a Circle.");
		System.out.println("===========================================");
		int choice=scan.nextInt();
		Rectangle rec=new Rectangle();
			
		
		Triangle tria=new Triangle();	
			
			
		Circle cir=new Circle();

			
			switch (choice) {
			case 1:
				rec.printArea();
				break;
            case 2:
            	tria.printArea();
				break;
			case 3:
				cir.printArea();	
					break;
					
			default:
				System.err.println("Please select a valid option.");
				break;
			}
		System.out.println("Do you want a new selection? (y/n)");
		 key=scan.next().charAt(0);
		}
		while(key=='y');
          scan.close();
		
		System.out.println("*******Thanks for using Shape APP*******");	
		
		}
	}





class Rectangle extends Shape
{

	@Override
	public void printArea() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of rectangle in centimeters: ");
		double length = sc.nextDouble();
		System.out.println("Enter width of rectangle in centimeters: ");
		double width = sc.nextDouble();
		System.out.println("Total area of rectangle is: "+(length*width)+"cm");
		
	}
	}



class Triangle extends Shape
{

	@Override
	public void printArea() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height of triangle in centimeters:");
		double height = sc.nextDouble();
		System.out.println("Enter length of triangle base in centimeters:");
		double base = sc.nextDouble();
		System.out.println("Total area of triangle is: "+(height*base/2)+"cm");	
	}
	
}


class Circle extends Shape
{

	@Override
	public void printArea() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle in centimeters:");
		double radius = sc.nextDouble();
		System.out.println("Total area of triangle is: "+(Math.PI*radius*radius)+"cm");	
		
	}
	
}