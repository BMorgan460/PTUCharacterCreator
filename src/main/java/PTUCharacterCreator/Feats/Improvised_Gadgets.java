package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Improvised_Gadgets extends Feature {
	{
		name = "Improvised Gadgets";
		tags = "[Gadgeteer Research Field] [Branch] [5-15 Playtest]";
		frequency = "Bind 2 AP - Extended Action";
		effect = "Target: A willing Pokemon with the Magnetic, Zapper, or Threaded Capability Effect: Choose one of the Capabilities listed in the Target line that the target Pokemon has. You create a Main or Off-Hand Equipment Item usable by Trainers that grants the user the chosen Capability. Whenever a Trainer makes Struggle Attacks using Zapper through this Item, they may choose to use your Technology Education Rank tripled in place of an offensive Stat. When this Feature is Unbound, the Equipment Item breaks and cannot be repaired. You may only have X instances of this Feature Bound at once, where X is equal to half your Technology Education Rank.";
		prereqs.put("Tech Edu", 3);
	}
	public Improvised_Gadgets(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Tech Edu",3);
	}
}