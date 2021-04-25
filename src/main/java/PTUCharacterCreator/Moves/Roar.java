package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Roar extends Move {
	{
		name = "Roar";
		effect = "When declaring Roar, the user does nothing. At the end of the round, the user Shifts and uses Roar. Targets hit by Roar immediately Shift away from the user using their highest useable movement capability, towards their Trainer if possible. If the target is an owned Pokemon and ends this shift within 6 meters of their Poke Ball, they are immediately recalled to their Poke Ball. If that Trainer sends out a replacement, they do not lose their Command action.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 2;
		frequency = "Scene";
		range = "Burst 1, Sonic, Social";
		type = "Normal";
		category = "Status";
	}
	public Roar(){}
}