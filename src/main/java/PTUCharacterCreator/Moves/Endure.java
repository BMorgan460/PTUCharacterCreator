package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Endure extends Move {
	{
		name = "Endure";
		effect = "If the user is hit by a damaging Move, you may use Endure as a Free Action. If the Move would bring Endure's user down to 0 HP or less, Endure's user instead is set to 1 HP.";
		damageBase = 0;
		AC = 0;
		frequency = "Daily";
		range = "Self, Reaction, Trigger";
		type = "Normal";
		category = "Status";
	}
	public Endure(){}
}