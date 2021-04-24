package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Giga_Drain extends Move {
	{
		name = "Giga Drain";
		effect = "After the target takes damage, the user gains HP equal to half of the damage they dealt to the target.";
		damageBase = 8;
		AC = 2;
		frequency = "Scene x2";
		range = "6, 1 Target";
		type = "Grass";
		category = "Special";
	}
	public Giga_Drain(){}
}