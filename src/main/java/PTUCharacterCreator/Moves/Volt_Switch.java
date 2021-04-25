package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Volt_Switch extends Move {
	{
		name = "Volt Switch";
		effect = "If Volt Switch successfully hits its target, the user deals damage and then immediately is returned to its Poke Ball in the same turn. A New Pokemon may immediately be sent out. Using Volt Switch lets a Trapped user be recalled";
		damageBase = 7;
		mDamageBase = 7;
		AC = 2;
		frequency = "At-Will";
		range = "5, 1 Target";
		type = "Electric";
		category = "Special";
	}
	public Volt_Switch(){}
}