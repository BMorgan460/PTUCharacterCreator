package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Guard_Split extends Move {
	{
		name = "Guard Split";
		effect = "The target loses 5 Defense and 5 Special Defense. If they do, the user gains 5 Damage Reduction. These effects last until the end of the Scene.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "Melee, 1 Target";
		type = "Psychic";
		category = "Status";
	}
	public Guard_Split(){}
}