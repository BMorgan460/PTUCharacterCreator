package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Synthesis extends Move {
	{
		name = "Synthesis";
		effect = "The user regains Hit Points equal to half of its full Hit Point value. If it is Sunny, the user gains 2/3 of its full Hit Point value. If it is Rainy, Sand Storming, or Hailing, the user gains 1/4 of its full Hit Point value.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Daily x2";
		range = "Self";
		type = "Grass";
		category = "Status";
	}
	public Synthesis(){}
}