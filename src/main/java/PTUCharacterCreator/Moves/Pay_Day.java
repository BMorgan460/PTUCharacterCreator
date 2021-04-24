package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Pay_Day extends Move {
	{
		name = "Pay Day";
		effect = "Pay Day scatters metal coins equal in value to 1d8 times the user's level. If it is a trainer battle, the winner of the battle gets to pick up the coins.";
		damageBase = 4;
		AC = 2;
		frequency = "Daily";
		range = "Cone 2";
		type = "Normal";
		category = "Physical";
	}
	public Pay_Day(){}
}