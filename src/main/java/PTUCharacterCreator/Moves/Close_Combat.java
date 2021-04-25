package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Close_Combat extends Move {
	{
		name = "Close Combat";
		effect = "Lower the user’s Defense and Special Defense by -1 CS each after damage.";
		damageBase = 12;
		mDamageBase = 12;
		AC = 2;
		frequency = "Scene x2";
		range = "Melee, 1 Target, Dash";
		type = "Fighting";
		category = "Physical";
	}
	public Close_Combat(){}
}