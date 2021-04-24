package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Wall_of_Iron extends Feature {
	{
		name = "Wall of Iron";
		tags = "[+Defense]";
		frequency = "Static";
		effect = "You learn the moves Iron Defense and Protect.";
		prereqs.put("Fortress", -1);
		prereqs.put("Combat", 4);
		prereqs.put("Focus", 4);
	}
	public Wall_of_Iron(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Fortress") && t.checkSkillRank("Combat",4) && t.checkSkillRank("Focus",4);
	}
}