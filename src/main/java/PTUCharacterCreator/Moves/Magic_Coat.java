package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Magic_Coat extends Move {
	{
		name = "Magic Coat";
		effect = "If the user is about to get a hit by a Move that does not have a Damage Dice Roll, they may use Magic Coat as an Interrupt. The Interrupted Move’s user is treated as if they were the target of their own Move, with the user of Magic Coat as the user.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Daily";
		range = "4, Interrupt, Trigger";
		type = "Psychic";
		category = "Status";
	}
	public Magic_Coat(){}
}