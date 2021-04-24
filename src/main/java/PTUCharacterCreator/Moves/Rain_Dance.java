package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Rain_Dance extends Move {
	{
		name = "Rain Dance";
		effect = "The weather becomes Rainy for 5 rounds. While Rainy, Water-Type Attacks gain a +5 bonus to Damage Rolls, and Fire-Type Attacks suffer a -5 Damage penalty.";
		damageBase = 0;
		AC = 0;
		frequency = "Daily x2";
		range = "Field, Weather";
		type = "Water";
		category = "Status";
	}
	public Rain_Dance(){}
}