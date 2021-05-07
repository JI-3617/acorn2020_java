package test.auto;

public class CampingCar extends Car {

	public CampingCar(Engine engine) {
		super(engine);
	}
	//메소드
	public void doCamping() {
		//부모 객체의 메소드 사용가능, this. 생략가능
		//┌상속이 됐으므로 부모객체 , 자식객체 모두 똑같은 참조값을 가리켜서
		//this.하면 모두 불러올 수 있음 
		this.drive();
		//부모객체의 필드 참조가능, this. 생략가능
		Engine e=this.engine;
	}
	
}
	
