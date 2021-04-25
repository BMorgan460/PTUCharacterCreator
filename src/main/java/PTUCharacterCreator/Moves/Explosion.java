package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Explosion extends Move {
	{
		name = "Explosion";
		effect = "The user's HP is set to -50% of their full HP. This HP loss cannot be prevented or reduced in any way. The user's loyalty toward its trainer may be lowered.";
		damageBase = 25;
		mDamageBase = 25;
		AC = 2;
		frequency = "Daily";
		range = "Burst 2";
		type = "Normal";
		category = "Physical";
	}
	public Explosion(){}
}