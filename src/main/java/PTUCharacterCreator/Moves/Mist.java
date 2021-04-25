package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Mist extends Move {
	{
		name = "Mist";
		effect = "Any user affected by Mist may activate it when having Combat Stages lowered by any effect, if they do, those Combat Stages are instead not lowered. Mist may be activated 3 times and then disappears.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Scene x2";
		range = "Blessing";
		type = "Ice";
		category = "Status";
	}
	public Mist(){}
}