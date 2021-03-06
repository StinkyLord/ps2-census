package stinkybot.utils.daybreakutils.query.dto.internal;

import stinkybot.utils.daybreakutils.anatomy.Collection;
import stinkybot.utils.daybreakutils.query.dto.CensusCollectionImpl;

public class ArmorFacing extends CensusCollectionImpl {

	private String armor_facing_id;
	private String description;
	
	public ArmorFacing() {
		super(Collection.ARMOR_FACING);
		
	}

	@Override
	public String toString() {
		return "ArmorFacing [armor_facing_id=" + armor_facing_id + ", description=" + description
				+ ", nestedCollections=" + nestedCollections + ", collection=" + collection + "]";
	}

	

}
