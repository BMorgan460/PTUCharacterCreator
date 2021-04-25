package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class False_Swipe extends Move {
	{
		name = "False Swipe";
		effect = "False Swipe's damage cannot bring a target lower than 1 HP.";
		damageBase = 4;
		mDamageBase = 4;
		AC = 2;
		frequency = "At-Will";
		range = "Melee, Pass";
		type = "Normal";
		category = "Physical";
	}
	public False_Swipe(){}
}