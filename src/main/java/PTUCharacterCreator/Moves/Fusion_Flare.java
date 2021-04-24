package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Fusion_Flare extends Move {
	{
		name = "Fusion Flare";
		effect = "If Fusion Bolt was used this round or last round by any participant of the encounter, Fusion Flare has its Damage Base increased by +3.";
		damageBase = 10;
		AC = 2;
		frequency = "Scene x2";
		range = "8, 1 Target, Smite";
		type = "Fire";
		category = "Special";
	}
	public Fusion_Flare(){}
}