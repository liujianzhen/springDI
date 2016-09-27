package springDI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DamselRescuingKnight {

	private Quest quest;
	
	//不创建Quest的实例，构造注入
	public DamselRescuingKnight(Quest quest) {
		this.quest = quest;
	}
	
	public void execute(){
		quest.embark();
	}
	public static void main(String[] args) {
		//获取IOC容器，相当于一个工厂
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//直接从容器获取DamselRescuingKnight实例，而不必知道其创建过程，若想替换传入的Quest参数，在配置文件中修改即可
		DamselRescuingKnight knight = context.getBean(DamselRescuingKnight.class);
		knight.execute();
	}
}
