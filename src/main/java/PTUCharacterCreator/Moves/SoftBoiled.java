package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class SoftBoiled extends Move {
	{
		name = "Soft-Boiled";
		effect = "The target regains Hit Points equal to half of its full Hit Points. The user may target themselves with Soft-Boiled.";
		damageBase = 0;
		AC = 0;
		frequency = "Daily x2";
		range = "Melee, 1 Target";
		type = "Normal";
		category = "Status";
	}
	public SoftBoiled(){}
}