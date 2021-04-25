package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Heal_Pulse extends Move {
	{
		name = "Heal Pulse";
		effect = "Restores 50% of the target’s max Hit Points. Heal Pulse’s user may not target itself with Heal Pulse.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Daily x2";
		range = "6, 1 Target, Aura";
		type = "Psychic";
		category = "Status";
	}
	public Heal_Pulse(){}
}