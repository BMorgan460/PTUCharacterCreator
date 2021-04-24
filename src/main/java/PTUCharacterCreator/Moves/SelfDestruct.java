package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class SelfDestruct extends Move {
	{
		name = "Self-Destruct";
		effect = "The user's HP is set to -50% of its full HP. This HP loss may not be prevented or reduced in any way. The user's loyalty may be lowered.";
		damageBase = 20;
		AC = 2;
		frequency = "Daily";
		range = "Burst 3";
		type = "Normal";
		category = "Physical";
	}
	public SelfDestruct(){}
}