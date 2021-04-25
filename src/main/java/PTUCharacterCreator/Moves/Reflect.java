package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Reflect extends Move {
	{
		name = "Reflect";
		effect = "Blessing – Any user affected by Reflect may activate it when receiving Physical Damage to resist the Damage one step. Reflect may be activated 2 times, and then disappears.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "Blessing";
		type = "Psychic";
		category = "Status";
	}
	public Reflect(){}
}