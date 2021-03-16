package PTUCharacterCreator.Abilities;
import PTUCharacterCreator.Ability;
public class MiniNoses extends Ability {
	{
		name = "Mini-Noses";
		freq = "Daily - Standard Action";
		effect = "Trigger: \nEffect: The user detaches up to three Mini-Noses from themselves and places them adjacent to them on the battlefield. These Mini-Noses have HP equal to the user's level but otherwise uses their user's stats. Each Mini-Nose has a Levitate Speed of 4. The user may Shift them each round on their turn, and they may originate any Ranged Move from one of the Mini-Noses instead of themselves if they choose. If a Mini-Nose is reduced to 0 HP, it is destroyed and takes a full 24 hours to regrow, one at a time. If the user has less than three grown Mini-Noses, then this ability can only place as many on the field as are available. All Mini-Noses deactivate, but are not destroyed, if the user is Fainted. Mini-Noses cannot be made to Shift more than 5 meters away from the user, if they are forced farther away, they will automatically Shift toward the user on the user's turn.";
	}
	public MiniNoses(){}
}