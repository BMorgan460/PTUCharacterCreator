package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Master_of_Arms extends Feature {
	{
		name = "Master of Arms";
		tags = "[+Defense] [Weapon]";
		frequency = "Static";
		effect = "You learn the Call to Arms and Unlimited Steel Works Talents.";
		prereqs.put("Steelheart", -1);
		prereqs.put("Athletics", 5);
		prereqs.put("Focus", 5);
	}
	public Master_of_Arms(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Steelheart") && t.checkSkillRank("Athletics",5) && t.checkSkillRank("Focus",5);
	}
}