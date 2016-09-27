package springDI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DamselRescuingKnight {

	private Quest quest;
	
	//������Quest��ʵ��������ע��
	public DamselRescuingKnight(Quest quest) {
		this.quest = quest;
	}
	
	public void execute(){
		quest.embark();
	}
	public static void main(String[] args) {
		//��ȡIOC�������൱��һ������
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//ֱ�Ӵ�������ȡDamselRescuingKnightʵ����������֪���䴴�����̣������滻�����Quest�������������ļ����޸ļ���
		DamselRescuingKnight knight = context.getBean(DamselRescuingKnight.class);
		knight.execute();
	}
}
