import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Equip;
import entity.Player;


public class PlayerTest {

	@Test
	public void test() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Player player=(Player)ctx.getBean("player");
		//player.print();
		player.printRing();
		Equip equip=new Equip();
		/*equip.setName("指环王");
		equip.setType("指环");
		equip.setDefencePlus(Long.parseLong("2"));
		equip.setDefencePlus(Long.parseLong("3"));
		equip.setDefencePlus(Long.parseLong("4"));*/
		player.updateEquip(player.getRing());
		player.printRing();
	}

}
