package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Lucky_Chant extends Move {
	{
		name = "Lucky Chant";
		effect = "Any user affected by Lucky Chant may activate it when receiving a Critical Hit to cause the attack to instead deal damage as if it was not a Critical Hit. Lucky Chant may be activated 3 times and then disappears.";
		damageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "Blessing";
		type = "Normal";
		category = "Status";
	}
	public Lucky_Chant(){}
}