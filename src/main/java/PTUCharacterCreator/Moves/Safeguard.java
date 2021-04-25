package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Safeguard extends Move {
	{
		name = "Safeguard";
		effect = "Blessing – Any user affected by Safeguard may activate it when receiving a Status Affliction to ignore the effects of that Status Affliction on their next turn. Safeguard may be activated 3 times, and then disappears.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "Blessing";
		type = "Normal";
		category = "Status";
	}
	public Safeguard(){}
}