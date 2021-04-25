package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Dragon_Ascent extends Move {
	{
		name = "Dragon Ascent";
		effect = "The user’s Defense and Special Defense are each lowered by -1 Combat Stage.";
		damageBase = 12;
		mDamageBase = 12;
		AC = 2;
		frequency = "Scene x2";
		range = "Melee, 1 Target, Dash";
		type = "Flying";
		category = "Physical";
	}
	public Dragon_Ascent(){}
}