package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Acid_Armor extends Move {
	{
		name = "Acid Armor";
		effect = "Set-Up Effect: The user becomes Liquefied. While Liquefied, the user is Slowed and cannot take Standard Actions except to Resolve the effect of Acid Armor, the user's Movement is never obstructed by rough or slow terrain, and the user can shift even through the smallest openings. Furthermore, while Liquefied, the user is completely immune to all Physical damage and becomes completely invisible if fully submerged in any liquid. Resolution Effect: The user gains +1 Defense CS, then stops being liquified.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "Self, Set-Up";
		type = "Poison";
		category = "Status";
	}
	public Acid_Armor(){}
}