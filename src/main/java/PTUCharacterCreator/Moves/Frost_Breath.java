package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Frost_Breath extends Move {
	{
		name = "Frost Breath";
		effect = "If Frost Breath hits, it is a Critical Hit. *Grants: Freezer";
		damageBase = 6;
		AC = 3;
		frequency = "EOT";
		range = "4, 1 Target";
		type = "Ice";
		category = "Special";
	}
	public Frost_Breath(){}
}