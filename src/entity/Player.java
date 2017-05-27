package entity;

public class Player {
	private Equip armet;// ͷ��
	private Equip loricae;// ����
	private Equip boot;// ѥ��
	private Equip ring; // ָ��

	public Equip getArmet() {
		return armet;
	}

	public void setArmet(Equip armet) {
		this.armet = armet;
	}

	public Equip getLoricae() {
		return loricae;
	}

	public void setLoricae(Equip loricae) {
		this.loricae = loricae;
	}

	public Equip getBoot() {
		return boot;
	}

	public void setBoot(Equip boot) {
		this.boot = boot;
	}

	public Equip getRing() {
		return ring;
	}

	public void setRing(Equip ring) {
		this.ring = ring;
	}

	public void updateEquip(Equip equip) {
		if ("ͷ��".equals(equip.getType())) {
			System.out.println(armet.getName() + "����Ϊ" + equip.getName());
			this.armet = equip;
		}
		if ("����".equals(equip.getType())) {
			System.out.println(loricae.getName() + "����Ϊ" + equip.getName());
			this.loricae = equip;
		}
		if ("ѥ��".equals(equip.getType())) {
			System.out.println(boot.getName() + "����Ϊ" + equip.getName());
			this.boot = equip;
		}
		if ("ָ��".equals(equip.getType())) {
			System.out.println(ring.getName() + "����Ϊ" + equip.getName());
			this.ring = equip;
		}
	}

	public void print() {
		System.out.println("����ҵ�װ��Ϊ��" + this.getArmet().getName() + "����"
				+ this.getLoricae().getName() + "����" + this.getBoot().getName()
				+ "����" + this.getRing().getName());
	}

	public void printRing() {
		if ("��ħָ��".equals(this.getRing().getName())) {
			System.out.println("��ħָ��[" + "�ٶ���Ч��"
					+ this.getRing().getSpeedPlus() + ";" + "������Ч��"
					+ this.getRing().getAttackPlus() + ";" + "������Ч��"
					+ this.getRing().getDefencePlus()+"]");
		}
	}
}
