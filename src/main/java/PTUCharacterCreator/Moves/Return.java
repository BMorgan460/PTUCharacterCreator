package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Return extends Move {
	{
		name = "Return";
		effect = "Return's DB is equal to 3 plus the user's Loyalty Value.";
		damageBase = 3;
		mDamageBase = 3;
		AC = 2;
		frequency = "At-Will";
		range = "Melee, 1 Target";
		type = "Normal";
		category = "Physical";
	}
	public Return(){}
}