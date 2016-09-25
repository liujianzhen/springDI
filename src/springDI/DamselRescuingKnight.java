package springDI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DamselRescuingKnight {

	private Quest quest;
	
	public DamselRescuingKnight(Quest quest) {
		this.quest = quest;
	}
	
	public void execute(){
		quest.embark();
	}
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DamselRescuingKnight knight = context.getBean(DamselRescuingKnight.class);
		knight.execute();
	}
}
