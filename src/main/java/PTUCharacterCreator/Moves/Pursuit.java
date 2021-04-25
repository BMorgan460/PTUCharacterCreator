package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Pursuit extends Move {
	{
		name = "Pursuit";
		effect = "If the foe is fleeing or being switched out, Pursuit may be used as an Interrupt, targeting the triggering foe. When used as an Interrupt, Pursuit grants the user a +5 bonus to all Movement Speeds, and has a Damage Base of 8 (2d8+10/19).";
		damageBase = 4;
		mDamageBase = 4;
		AC = 2;
		frequency = "At-Will";
		range = "Melee, 1 Target";
		type = "Dark";
		category = "Physical";
	}
	public Pursuit(){}
}