package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class TwoSecond_Preview extends Feature {
	{
		name = "Two-Second Preview";
		tags = "[+Special Defense]";
		frequency = "Static";
		effect = "You gain the Instinct Ability.";
		prereqs.put("3 Oracle Features", 0);
		prereqs.put("Perception", 5);
	}
	public TwoSecond_Preview(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Perception",5);
	}
}