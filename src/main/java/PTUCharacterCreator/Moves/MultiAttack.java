package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class MultiAttack extends Move {
	{
		name = "Multi-Attack";
		effect = "This attack’s type matches the Primary type of the the user.";
		damageBase = 9;
		mDamageBase = 9;
		AC = 2;
		frequency = "Scene";
		range = "Melee, Cone 2, Smite";
		type = "Normal";
		category = "Physical";
	}
	public MultiAttack(){}
}