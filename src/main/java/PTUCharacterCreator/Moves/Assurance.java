package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Assurance extends Move {
	{
		name = "Assurance";
		effect = "If Assurance’s target has already been damaged by a Move on the same round Assurance is being used, Assurance has a Damage Base of 12 (3d12+10 / 30) instead. This effect may trigger only once per Scene per Target.";
		damageBase = 6;
		mDamageBase = 6;
		AC = 2;
		frequency = "At-Will";
		range = "Melee, 1 Target";
		type = "Dark";
		category = "Physical";
	}
	public Assurance(){}
}