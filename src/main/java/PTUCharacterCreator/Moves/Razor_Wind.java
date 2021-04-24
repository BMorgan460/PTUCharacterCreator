package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Razor_Wind extends Move {
	{
		name = "Razor Wind";
		effect = "Set-Up Effect: The user may not shift this round. The user whips up a whirlwind around themselves, granting +2 Evasion until the end of their next turn and destroying any Smokescreen or Hazards on any squares it is standing on and in all squares adjacent to it. Resolution Effect: The user attacks with Razor Wind. Razor Wind is a Critical Hit on 18+.";
		damageBase = 8;
		AC = 2;
		frequency = "EOT";
		range = "10, 3 Targets, Set -Up";
		type = "Normal";
		category = "Special";
	}
	public Razor_Wind(){}
}