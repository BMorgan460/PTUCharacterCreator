package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Light_Screen extends Move {
	{
		name = "Light Screen";
		effect = "Blessing – Any user affected by Light Screen may activate it when receiving Special Damage to resist the Damage one step. Light Screen may be activated 2 times, and then disappears.";
		damageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "Blessing";
		type = "Psychic";
		category = "Status";
	}
	public Light_Screen(){}
}