package census.enums;

public enum Faction {
    NONE(0),
    VANU_SOVEREIGNTY(1),
    NEW_CONGLOMERATE(2),
    TERRAN_REPUBLIC(3),
    NS_OPERATIVES(4);
	
	private int value;
	
	private Faction(int value) {
		this.value = value;
	}
	
	public static Faction findFaction(int id) {
		for (Faction faction : Faction.values()) {
			if (faction.getValue() == id) {
				return faction;
			}
		}
		return null;
	}
	
	public int getValue() {
		return value;
	}
}
