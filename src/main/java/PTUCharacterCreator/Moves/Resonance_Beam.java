package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Resonance_Beam extends Move {
	{
		name = "Resonance Beam";
		effect = "All targets have their Special Defense lowered by 1 Combat Stage on 20+. This Effect Range is extended by +1 for each foe targeted by this Move.";
		damageBase = 4;
		AC = 3;
		frequency = "EOT";
		range = "Line 4";
		type = "Weapon";
		category = "Special";
	}
	public Resonance_Beam(){}
}