package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Floral_Healing extends Move {
	{
		name = "Floral Healing";
		effect = "Restore 50% of the targets max Hit Points. If the target is on Grassy Terrain, Floral Healing restores an additional tick of Hit Point. Floral Healing may not target the user.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Daily x2";
		range = "6, 1 Target";
		type = "Fairy";
		category = "Status";
	}
	public Floral_Healing(){}
}