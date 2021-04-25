package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Spirit_Shackle extends Move {
	{
		name = "Spirit Shackle";
		effect = "The target is Trapped and Slowed for the remainder of the encounter.";
		damageBase = 8;
		mDamageBase = 8;
		AC = 4;
		frequency = "Scene x2";
		range = "8, 1 Target";
		type = "Ghost";
		category = "Physical";
	}
	public Spirit_Shackle(){}
}