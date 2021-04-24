package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Feint extends Move {
	{
		name = "Feint";
		effect = "If a foe uses a Move with the Shield Keyword in response to one of your actions, you may activate Feint to cause the triggering Move to Fail. Feint is activated as a Free Action.";
		damageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "Trigger";
		type = "Normal";
		category = "Status";
	}
	public Feint(){}
}