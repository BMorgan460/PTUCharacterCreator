package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Electric_Terrain extends Move {
	{
		name = "Electric Terrain";
		effect = "The field becomes Electrified for 5 rounds. While the field is Electrified, Pokemon and Trainers touching the ground are immune to Sleep, and Electric-Type attacks used by Pokemon and Trainers touching the ground gain a +10 Bonus to Damage Rolls.";
		damageBase = 0;
		AC = 0;
		frequency = "Daily x2";
		range = "Field";
		type = "Electric";
		category = "Status";
	}
	public Electric_Terrain(){}
}