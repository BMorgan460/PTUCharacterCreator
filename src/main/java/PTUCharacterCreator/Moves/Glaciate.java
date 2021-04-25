package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Glaciate extends Move {
	{
		name = "Glaciate";
		effect = "All Legal Targets have their Speed lowered 1 Combat Stage. On an Even-Numbered Roll, all Legal Targets on the ground are Slowed.";
		damageBase = 7;
		mDamageBase = 7;
		AC = 3;
		frequency = "EOT";
		range = "Burst 2";
		type = "Ice";
		category = "Special";
	}
	public Glaciate(){}
}