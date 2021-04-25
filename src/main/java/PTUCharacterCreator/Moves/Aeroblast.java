package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Aeroblast extends Move {
	{
		name = "Aeroblast";
		effect = "Aeroblast is a Critical Hit on an Even-Numbered Roll.";
		damageBase = 10;
		mDamageBase = 10;
		AC = 3;
		frequency = "Daily";
		range = "Line 6";
		type = "Flying";
		category = "Special";
	}
	public Aeroblast(){}
}