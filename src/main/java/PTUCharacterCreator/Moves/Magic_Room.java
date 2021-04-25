package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Magic_Room extends Move {
	{
		name = "Magic Room";
		effect = "The area becomes Useless for 5 rounds. While Useless, Pokemon may not benefit from the effects of any Held Items, and Trainers cannot benefit from any Accessory-Slot equipment. This does not affect consumable or activated items, only Items with Static effects or Triggers.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Daily x2";
		range = "Field";
		type = "Psychic";
		category = "Status";
	}
	public Magic_Room(){}
}