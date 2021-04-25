package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Absorb extends Move {
	{
		name = "Absorb";
		effect = "After the target takes damage, the user gains HP equal to half of the damage they dealt to the target.";
		damageBase = 2;
		mDamageBase = 2;
		AC = 2;
		frequency = "At-Will";
		range = "4, 1 Target";
		type = "Grass";
		category = "Special";
	}
	public Absorb(){}
}