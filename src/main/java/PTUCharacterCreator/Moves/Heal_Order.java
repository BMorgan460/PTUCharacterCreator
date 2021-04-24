package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Heal_Order extends Move {
	{
		name = "Heal Order";
		effect = "The user regains HP equal to half of its full HP.";
		damageBase = 0;
		AC = 0;
		frequency = "Daily x2";
		range = "Self";
		type = "Bug";
		category = "Status";
	}
	public Heal_Order(){}
}