package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Stat_Embodiment extends Feature {
	{
		name = "Stat Embodiment";
		tags = "[Branch]";
		frequency = "1 AP - Swift Action";
		effect = "Target: Your Pokemon Effect: Your Pokemon gains an Ability, based on your Chosen Stat, for the remainder of the Scene. Switching does not end this effect. Stat Embodiment may only grant one Ability to a Pokemon at a time. If it is used a second time on the same target, it replaces the first granted Ability. »» Attack Aces give Sheer Force or Defiant »» Defense Aces give Filter or Battle Armor »» Special Attack Aces give Tinted Lens or Competitive »» Special Defense Aces give Multiscale or Tolerance »» Speed Aces give Speed Boost or Vanguard";
		prereqs.put("4 Stat Ace Features", 0);
		prereqs.put("Command", 5);
		prereqs.put("Focus", 5);
	}
	public Stat_Embodiment(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Command",5) && t.checkSkillRank("Focus",5);
	}
}