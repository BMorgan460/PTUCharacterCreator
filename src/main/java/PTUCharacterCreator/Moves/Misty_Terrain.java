package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Misty_Terrain extends Move {
	{
		name = "Misty Terrain";
		effect = "The area becomes Misty for 5 turns, While Misty, all Pokemon and Traners standing on the ground ignore the first turn of all Status Afflictions, and Dragon-type attacks targeting or origination from a grounded Pokemon or Trainer take a -10 Penalty to Damage Rolls.";
		damageBase = 0;
		AC = 0;
		frequency = "Daily x2";
		range = "Field";
		type = "Fairy";
		category = "Status";
	}
	public Misty_Terrain(){}
}