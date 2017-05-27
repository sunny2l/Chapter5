package aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.JoinPoint;
import entity.Equip;

public class FreeUpdate {
	public void before(JoinPoint jp) {
		/*Object[] args = jp.getArgs();
		Equip equip=(Equip)Arrays.asList(args).get(0);*/
		Equip equip=(Equip)(jp.getArgs())[0];
		if ("指环".equals(equip.getType())) {
			equip.setName(equip.getName()+"+"+"紫色梦幻");
			equip.setAttackPlus(equip.getAttackPlus()+6);
			equip.setDefencePlus(equip.getDefencePlus()+6);
			//System.out.println(ring.getName() + "升级为" + equip.getName()+ring.getName());
		}
	}
}
