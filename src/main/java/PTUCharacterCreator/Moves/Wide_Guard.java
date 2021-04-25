package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Wide_Guard extends Move {
	{
		name = "Wide Guard";
		effect = "If an Ally adjacent to Wide Guard’s user is hit by a Move, you may use Wide Guard as an Interrupt. All targets adjacent to Wide Guard’s user, including the user, are instead not hit by the triggering Move and do not suffer any of its effects.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "Burst 1, Interrupt, Shield, Trigger";
		type = "Rock";
		category = "Status";
	}
	public Wide_Guard(){}
}