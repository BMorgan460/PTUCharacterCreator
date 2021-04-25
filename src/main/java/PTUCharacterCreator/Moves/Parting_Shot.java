package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Parting_Shot extends Move {
	{
		name = "Parting Shot";
		effect = "If Parting Shot successfully hits, the target's Attack and Special Attack stats are lowered by one CS and the user is immediately recalled in the same turn. A new Pokemon may immediately be sent out. using Parting Shot lets a Trapped user be recalled.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 2;
		frequency = "At-Will";
		range = "6, 1 Target, Social";
		type = "Dark";
		category = "Status";
	}
	public Parting_Shot(){}
}