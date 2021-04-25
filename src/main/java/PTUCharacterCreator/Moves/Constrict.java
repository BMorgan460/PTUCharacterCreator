package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Constrict extends Move {
	{
		name = "Constrict";
		effect = "Lower the target’s Speed by -1 CS. Constrict may be used as a Swift Action against targets the user is Grappling and automatically hits when performed this way.";
		damageBase = 1;
		mDamageBase = 1;
		AC = 2;
		frequency = "At-Will";
		range = "Melee, 1 Target";
		type = "Normal";
		category = "Physical";
	}
	public Constrict(){}
}