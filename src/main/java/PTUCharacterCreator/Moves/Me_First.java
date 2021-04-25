package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Me_First extends Move {
	{
		name = "Me First";
		effect = "If an opponent declares a Damaging Attack against the user, and Me First’s user has a higher Speed stat then the target, the user may use Me First as an Interrupt. The User will then use the same Move the triggering foe was about to use on that foe.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "Self, Trigger, Interrupt";
		type = "Normal";
		category = "Status";
	}
	public Me_First(){}
}