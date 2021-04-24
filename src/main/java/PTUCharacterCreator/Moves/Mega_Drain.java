package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Mega_Drain extends Move {
	{
		name = "Mega Drain";
		effect = "After the target takes damage, the user gains HP equal to half of the damage they dealt to the target.";
		damageBase = 4;
		AC = 2;
		frequency = "At-Will";
		range = "6, 1 Target";
		type = "Grass";
		category = "Special";
	}
	public Mega_Drain(){}
}