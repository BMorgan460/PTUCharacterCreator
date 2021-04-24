package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Moonlight extends Move {
	{
		name = "Moonlight";
		effect = "The user regains HP equal to half of its full HP. If it is Sunny, the user gains 2/3 of its full HP. If it is Rainy, Sand Storming, or Hailing, the user gains 1/4 of its full HP.";
		damageBase = 0;
		AC = 0;
		frequency = "Daily x2";
		range = "Self";
		type = "Fairy";
		category = "Status";
	}
	public Moonlight(){}
}