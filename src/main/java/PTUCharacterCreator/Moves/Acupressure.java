package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Acupressure extends Move {
	{
		name = "Acupressure";
		effect = "Roll 1d6. On a result of 1, raise the target’s Attack by +2 CS. On a result of 2, raise the target’s Defense by +2 CS. On a result of 3, raise the target’s Special Attack by +2 CS. On a result of 4, raise the target’s Special Defense by +2 CS. On a result of 5, raise the target’s Speed by +2 CS. On a result of 6, raise the target’s Accuracy by +2.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 2;
		frequency = "EOT";
		range = "Melee, 1 Target or Self";
		type = "Normal";
		category = "Status";
	}
	public Acupressure(){}
}