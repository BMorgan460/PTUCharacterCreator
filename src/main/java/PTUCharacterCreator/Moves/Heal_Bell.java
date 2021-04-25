package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Heal_Bell extends Move {
	{
		name = "Heal Bell";
		effect = "All targets are cured of any Persistent Status ailments.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "Burst 3, Sonic";
		type = "Normal";
		category = "Status";
	}
	public Heal_Bell(){}
}