package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Hail extends Move {
	{
		name = "Hail";
		effect = "The weather changes to Hail for 5 rounds. While it is Hailing, all non-Ice Type Pokemon lose a Tick of Hit Points at the beginning of their turn.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Daily x2";
		range = "Field, Weather";
		type = "Ice";
		category = "Status";
	}
	public Hail(){}
}