package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Defense_Embodiment extends Feature {
	{
		name = "Defense Embodiment";
		tags = "[Branch]";
		frequency = "1 AP - Swift Action";
		effect = "Target: Your Pokemon Effect: Your Pokemon gains Filter or Battle Armor for the remainder of the Scene. Switching does not end this effect. Stat Embodiment may only grant one Ability to a Pokemon at a time. If it is used a second time on the same target, it replaces the first granted Ability.";
		prereqs.put("4 Stat Ace Features", 0);
		prereqs.put("Command", 5);
		prereqs.put("Focus", 5);
	}
	public Defense_Embodiment(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Command",5) && t.checkSkillRank("Focus",5) && t.hasFeat("Defense Ace");
	}
}