package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Thunderbolt extends Move {
	{
		name = "Thunderbolt";
		effect = "Thunderbolt Paralyzes the target on 19+.";
		damageBase = 9;
		AC = 2;
		frequency = "EOT";
		range = "4, 1 Target";
		type = "Electric";
		category = "Special";
	}
	public Thunderbolt(){}
}