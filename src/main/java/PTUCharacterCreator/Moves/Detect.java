package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Detect extends Move {
	{
		name = "Detect";
		effect = "If the user is hit by a Move, the user may use Detect. The user is instead not hit by the Move. You do not take any damage nor are you affected by anty of the Move's effects";
		damageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "Self, Trigger, Interrupt, Shield";
		type = "Fighting";
		category = "Status";
	}
	public Detect(){}
}