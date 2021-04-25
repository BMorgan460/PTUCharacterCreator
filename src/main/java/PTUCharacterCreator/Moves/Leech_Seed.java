package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Leech_Seed extends Move {
	{
		name = "Leech Seed";
		effect = "At the beginning of each of the target's turns, Leech Seed's target loses 1/10th of their full HP. Leech Seed's user then gains HP equal to the amount the target lost. Leech Seed lasts until the target faints or is returned to a Poke Ball. Grass Types and targets immune to Grass Attacks are immune to Leech Seed";
		damageBase = 0;
		mDamageBase = 0;
		AC = 4;
		frequency = "Daily x2";
		range = "6, 1 Target";
		type = "Grass";
		category = "Status";
	}
	public Leech_Seed(){}
}