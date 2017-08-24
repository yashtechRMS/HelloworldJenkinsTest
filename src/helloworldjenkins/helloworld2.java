package helloworldjenkins;

import org.testng.annotations.Test;


public class helloworld2 {

	@Test
	public static void Hello2test() {
		for(int i=1; i<=10; i++){
			System.out.println("Hello world 2 .. "+i);
		}
		
		System.out.println("--------------------------Secound method is completed --------------------------- ");
		System.out.println("--------------------------First method is completed --------------------------- ");
	}

}
