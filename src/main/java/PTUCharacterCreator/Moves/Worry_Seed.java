package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Worry_Seed extends Move {
	{
		name = "Worry Seed";
		effect = "You choose one of the target’s Abilities. Worry Seed changes that Ability to Insomnia for the remainder of the encounter.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 2;
		frequency = "Scene";
		range = "8, 1 Target";
		type = "Grass";
		category = "Status";
	}
	public Worry_Seed(){}
}