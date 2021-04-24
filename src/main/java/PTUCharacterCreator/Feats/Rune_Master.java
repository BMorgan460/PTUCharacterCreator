package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Rune_Master extends Feature {
	{
		name = "Rune Master";
		tags = "[Class] [+Attack or Special Attack]";
		frequency = "Static";
		effect = "You gain the Gather Unown capability, and your Unown gain the Letter Press Capability. When using Gather Unown, you are treated as a level 20 Pokemon.";
		prereqs.put("Own 2 Unown", 0);
		prereqs.put("Ocu Edu", 3);
	}
	public Rune_Master(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Ocu Edu",3);
	}
}