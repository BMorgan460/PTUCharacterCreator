package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Power_Split extends Move {
	{
		name = "Power Split";
		effect = "The target has their Attack and Special Attack lowered by 5. If they do, the user gains a +5 bonus to Damage Rolls. These effects last until the end of the scene.";
		damageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "Melee, 1 Target";
		type = "Psychic";
		category = "Status";
	}
	public Power_Split(){}
}