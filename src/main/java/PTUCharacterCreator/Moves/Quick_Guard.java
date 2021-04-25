package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Quick_Guard extends Move {
	{
		name = "Quick Guard";
		effect = "If the user or an adjacent ally is targeted by a Priority or Interrupt Attack, Quick Guard may be declared as an Interrupt, causing the triggering attack to have no effect.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "Melee, Interrupt, Shield, Trigger";
		type = "Fighting";
		category = "Status";
	}
	public Quick_Guard(){}
}