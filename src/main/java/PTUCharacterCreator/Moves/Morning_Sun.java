package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Morning_Sun extends Move {
	{
		name = "Morning Sun";
		effect = "The user regains Hit Points equal to half of its full Hit Point value. If it is Sunny, the user gains 2/3 of its full Hit Point value. If it is Rainy, Sand Storming or Hailing the user gains 1/4 of their full Hit Point value.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Daily x2";
		range = "Self";
		type = "Normal";
		category = "Status";
	}
	public Morning_Sun(){}
}