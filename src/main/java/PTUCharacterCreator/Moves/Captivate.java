package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Captivate extends Move {
	{
		name = "Captivate";
		effect = "Captivate lowers the target's Special Attack by -2 CS. Captivate may not affect something that is the same gender as the user or something that is genderless.";
		damageBase = 0;
		AC = 2;
		frequency = "EOT";
		range = "Cone 2, Friendly, Social";
		type = "Normal";
		category = "Status";
	}
	public Captivate(){}
}