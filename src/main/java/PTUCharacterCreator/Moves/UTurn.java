package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class UTurn extends Move {
	{
		name = "U-Turn";
		effect = "The user deals damage and then is immediately recalled to its Poké Ball in the same turn. A New Pokémon may immediately be sent out. Using U-Turn lets a Trapped user be recalled.";
		damageBase = 7;
		AC = 2;
		frequency = "At-Will";
		range = "Melee, 1 Target, Dash";
		type = "Bug";
		category = "Physical";
	}
	public UTurn(){}
}