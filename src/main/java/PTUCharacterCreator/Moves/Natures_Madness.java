package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Natures_Madness extends Move {
	{
		name = "Nature's Madness";
		effect = "All legal targets lose 1/2 their current Hit Points. Any targets who avoid this attack instead lose 1 Tick of Hit points.";
		damageBase = 0;
		AC = 4;
		frequency = "Daily";
		range = "6, Ranged Blast 2, Smite";
		type = "Fairy";
		category = "Special";
	}
	public Natures_Madness(){}
}