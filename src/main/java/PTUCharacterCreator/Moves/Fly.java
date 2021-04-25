package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Fly extends Move {
	{
		name = "Fly";
		effect = "Set-Up Effect: The user is moved up 25 meters into the air. Resolution Effect: The user may shift twice while in the air, using their overland or sky speed, and then comes down next to a legal target, and attacks with Fly. *Grants: Sky +3";
		damageBase = 8;
		mDamageBase = 8;
		AC = 3;
		frequency = "At-Will";
		range = "Melee, Dash, Set-Up";
		type = "Flying";
		category = "Physical";
	}
	public Fly(){}
}