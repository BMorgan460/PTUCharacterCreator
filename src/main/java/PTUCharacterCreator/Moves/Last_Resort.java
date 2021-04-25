package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Last_Resort extends Move {
	{
		name = "Last Resort";
		effect = "Last Resort can only be used after the user has performed 5 other different Moves in its Move List during a single fight, without being switched out.";
		damageBase = 14;
		mDamageBase = 14;
		AC = 2;
		frequency = "At-Will";
		range = "Melee, 1 Target, Dash";
		type = "Normal";
		category = "Special";
	}
	public Last_Resort(){}
}