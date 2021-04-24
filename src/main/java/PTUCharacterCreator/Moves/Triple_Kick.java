package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Triple_Kick extends Move {
	{
		name = "Triple Kick";
		effect = "Make three attacks with Triple Kick. If you hit once, Triple Kick has a DB of 1. If you hit two times, Triple Kick has a DB of 3. If you hit three times, Triple Kick has a DB of 6.";
		damageBase = 3;
		AC = 3;
		frequency = "At-Will";
		range = "Melee, 1 Target";
		type = "Fighting";
		category = "Physical";
	}
	public Triple_Kick(){}
}