package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Kinesis extends Move {
	{
		name = "Kinesis";
		effect = "If the user or an Ally within 6 meters is about to be hit by an attack, the user may use Kinesis as an interrupt. The triggering Accuracy Roll receives a -4 penalty. This may cause Moves to miss.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "6, 1 Target, Trigger, Interrupt";
		type = "Psychic";
		category = "Status";
	}
	public Kinesis(){}
}