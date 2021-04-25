package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Sing extends Move {
	{
		name = "Sing";
		effect = "All legal Targets fall Asleep. On a miss, Sing instead causes targets to become Slowed and suffer a -2 penalty to their Evasion until the end of the user's next turn.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 10;
		frequency = "Scene";
		range = "Burst 2, Friendly, Sonic";
		type = "Normal";
		category = "Status";
	}
	public Sing(){}
}