package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Shock_Wave extends Move {
	{
		name = "Shock Wave";
		effect = "Shock Wave cannot miss. *Grants Zapper";
		damageBase = 6;
		AC = 0;
		frequency = "At-Will";
		range = "6, 1 Target";
		type = "Electric";
		category = "Special";
	}
	public Shock_Wave(){}
}