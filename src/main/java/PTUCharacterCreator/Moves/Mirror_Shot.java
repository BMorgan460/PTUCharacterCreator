package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Mirror_Shot extends Move {
	{
		name = "Mirror Shot";
		effect = "All Legal Targets have their Accuracy lowered by -2 on 16+.";
		damageBase = 7;
		AC = 5;
		frequency = "EOT";
		range = "6, Ranged Blast 2";
		type = "Steel";
		category = "Special";
	}
	public Mirror_Shot(){}
}