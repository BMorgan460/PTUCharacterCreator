package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Icy_Wind extends Move {
	{
		name = "Icy Wind";
		effect = "All Legal Targets have their Speed lowered 1 Combat Stage.";
		damageBase = 6;
		AC = 3;
		frequency = "EOT";
		range = "Cone 2";
		type = "Ice";
		category = "Special";
	}
	public Icy_Wind(){}
}