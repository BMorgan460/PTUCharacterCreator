package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Fling extends Move {
	{
		name = "Fling";
		effect = "The user throws a held item, determining the effect of Fling.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 2;
		frequency = "Scene x2";
		range = "6, 1 Target, Fling";
		type = "Dark";
		category = "Physical";
	}
	public Fling(){}
}