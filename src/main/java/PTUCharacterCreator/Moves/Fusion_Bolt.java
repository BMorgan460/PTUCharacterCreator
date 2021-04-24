package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Fusion_Bolt extends Move {
	{
		name = "Fusion Bolt";
		effect = "Fusion Bolt has its Damage Base increased by +3 if Fusion Flare was used this round or last round by any participant of the encounter.";
		damageBase = 10;
		AC = 2;
		frequency = "Scene x2";
		range = "8, 1 Target, Smite";
		type = "Electric";
		category = "Physical";
	}
	public Fusion_Bolt(){}
}