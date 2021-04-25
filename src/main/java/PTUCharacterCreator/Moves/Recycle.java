package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Recycle extends Move {
	{
		name = "Recycle";
		effect = "The effect of a consumable item used earlier in the encounter is used again as if it had not been destroyed. The item is still gone.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "Self";
		type = "Normal";
		category = "Status";
	}
	public Recycle(){}
}