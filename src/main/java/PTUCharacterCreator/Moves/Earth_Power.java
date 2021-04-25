package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Earth_Power extends Move {
	{
		name = "Earth Power";
		effect = "Earth Power lowers the Special Defense of all Legal Targets 1 Combat Stage on 16+.";
		damageBase = 9;
		mDamageBase = 9;
		AC = 2;
		frequency = "EOT";
		range = "6, 1 Target, Groundsource";
		type = "Ground";
		category = "Special";
	}
	public Earth_Power(){}
}