package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Spirit_Lance extends Move {
	{
		name = "Spirit Lance";
		effect = "Spirit Lance deals +3 damage to all targets for each target beyond the first that it successfully hits.";
		damageBase = 6;
		AC = 2;
		frequency = "Scene x2";
		range = "Line 6";
		type = "Weapon";
		category = "Special";
	}
	public Spirit_Lance(){}
}