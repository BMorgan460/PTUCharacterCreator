package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Gunk_Shot extends Move {
	{
		name = "Gunk Shot";
		effect = "Gunk Shot Poisons the target on 15+.";
		damageBase = 12;
		mDamageBase = 12;
		AC = 5;
		frequency = "Daily x2";
		range = "6, 1 Target, Smite";
		type = "Poison";
		category = "Physical";
	}
	public Gunk_Shot(){}
}