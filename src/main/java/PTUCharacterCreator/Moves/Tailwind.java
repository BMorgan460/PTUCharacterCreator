package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Tailwind extends Move {
	{
		name = "Tailwind";
		effect = "For the remainder of the encounter, all allied trainers and Pokemon gain +5 to their Initiative. Multiple instances of Tailwind cannot stack. *Grants: Guster";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "Blessing";
		type = "Flying";
		category = "Status";
	}
	public Tailwind(){}
}