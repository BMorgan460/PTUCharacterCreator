package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Bulldoze extends Move {
	{
		name = "Bulldoze";
		effect = "All Legal Targets are lowered 1 Speed Combat Stage.";
		damageBase = 6;
		mDamageBase = 6;
		AC = 2;
		frequency = "EOT";
		range = "Burst 1";
		type = "Ground";
		category = "Physical";
	}
	public Bulldoze(){}
}