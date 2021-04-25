package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Bleed extends Move {
	{
		name = "Bleed!";
		effect = "The target loses a Tick of Hit Points at the start of their next three turns.";
		damageBase = 9;
		mDamageBase = 9;
		AC = 2;
		frequency = "Scene x2";
		range = "WR, 1 Target";
		type = "Weapon";
		category = "Physical";
	}
	public Bleed(){}
}