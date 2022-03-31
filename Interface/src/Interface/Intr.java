package Interface;

public class Intr implements Interface1,Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                    Intr i=new Intr();
                    i.akshu();
                    i.car();
                    i.sarang();
                    i.swift();
	}

	@Override
	public void akshu() {
	                 System.out.println("my name akshya");
		
	}

	@Override
	public void sarang() {
		System.out.println(" my name sarang");
		
	}

	@Override
	public void car() {
		System.out.println("car is creta");
		
	}

	@Override
	public void swift() {
		System.out.println(" maruti suzuki");
		
	}

}
