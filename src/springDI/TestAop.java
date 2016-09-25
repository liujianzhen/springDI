package springDI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {

	public void execute(){
		System.out.println("≤‚ ‘AOP");
	}
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		TestAop testAop = context.getBean(TestAop.class);
		testAop.execute();
	}
}
