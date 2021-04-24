package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Healing_Wish extends Move {
	{
		name = "Healing Wish";
		effect = "The user immediately Faints, lowering its HP to 0. The user takes no Injuries from HP Markers when using Healing Wish. The target is immediately cured of up to 3 injuries, healed to their Maximum Hit Points, and has the Frequency of all Moves restored. Healing Wish may target a Pokemon in a Poke Ball. Healing Wish does not restore the Frequency of Healing Wish or Lunar Dance. Injuries healed through Healing Wish count toward the total number of Injuries that can be healed each day, and this healing is limited by the same.";
		damageBase = 0;
		AC = 0;
		frequency = "Daily";
		range = "6, 1 Target";
		type = "Psychic";
		category = "Status";
	}
	public Healing_Wish(){}
}