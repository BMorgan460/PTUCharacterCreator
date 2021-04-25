package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Stealth_Rock extends Move {
	{
		name = "Stealth Rock";
		effect = "Set 4 square meters of Stealth Rock hazards within 6 meters. If a foe moves within 2 meters of a space occupied by Rocks, move at most one Rock to the offender, then destroy the Rock. When that happens, the Stealth Rock causes a foe to lose a Tick of Hit Points. Stealth Rock is considered to be dealing damage, Apply Weakness and Resistance. Do not apply stats. A Pokemon who has been hit by a Stealth Rock Hazard cannot get hit by another in the same encounter until it is returned to a Poke Ball and then sent back out. *Grants Materializer";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Scene";
		range = "Field, Hazard";
		type = "Rock";
		category = "Status";
	}
	public Stealth_Rock(){}
}