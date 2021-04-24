package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Fairy_Lock extends Move {
	{
		name = "Fairy Lock";
		effect = "All legal targets become Trapped and Slowed while the user remains in the encounter. If the user is switched or knocked out, this effect ends.";
		damageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "Burst 3, Friendly";
		type = "Fairy";
		category = "Status";
	}
	public Fairy_Lock(){}
}