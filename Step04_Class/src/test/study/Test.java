package test.study;

import test.mypac.Car;
import test.mypac.MyUtil;

public class Test {
	public static void main(String[] args) {
		Car a=new Car();
		a.drive();
		a.name="소나타";
		
		Car car2=new Car();
		car2.drive();
		car2.name="페라리";
		
		MyUtil.send();
		MyUtil.version="1.0";
		
		new Car().drive();
		Car car1=new Car();
		car1.drive();
		Car car2=new Car();
		car2.drive();
		
		MyUtil 
	}
}
