package nueip.java.winnie;

public class TransportObjects {
	public static void main(String[] args) {
		Car car = new Car();
		Motorcycle moto = new Motorcycle();
		car.move();
		moto.move();
	}
}

class Transport {
	protected int wheel;
}

interface mover {
	public abstract void move();
}

class Car extends Transport implements mover {
	public Car() {
		this.wheel = 4;
	}

	@Override
	public void move() {
		System.out.println("The car is moving fast...");
	}
}

class Motorcycle extends Transport implements mover {
	public Motorcycle() {
		this.wheel = 2;
	}

	@Override
	public void move() {
		System.out.println("The motorcycle is moving slowly...");
	}
}
