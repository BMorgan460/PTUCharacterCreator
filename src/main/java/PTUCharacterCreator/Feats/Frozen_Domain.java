package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Frozen_Domain extends Feature {
	{
		name = "Frozen Domain";
		tags = "[+Attack or Special Attack]";
		frequency = "2 AP - Standard Action ";
		effect = "Set 6 square meters of Frozen Domain within range 6. All 6 meters must be adjacent with at least one other space of Frozen Domain. All legal targets passing through these squares must make an Acrobatics check with a DC equal to 4 + twice your Survival Rank. On failure, the target is Tripped. Pokemon who are flying, levitating, or have the Naturewalk (Tundra) Capability are immune to this effect. When standing on a square affected by Frozen Domain, you may act as if you were in Hail weather. When a Fire-Type attack originates from or targets a square of Frozen Domain, that square of Frozen Domain melts and is cleared. Frozen Domain is considered a Hazard.";
		prereqs.put("Athletics", 5);
		prereqs.put("Survival", 5);
	}
	public Frozen_Domain(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Athletics",5) && t.checkSkillRank("Survival",5);
	}
}