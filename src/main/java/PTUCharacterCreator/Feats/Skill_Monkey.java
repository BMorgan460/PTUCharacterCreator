package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Skill_Monkey extends Feature {
	{
		name = "Skill Monkey";
		tags = "";
		frequency = "Daily x3 - Free Action";
		effect = "Trigger: You make a Skill Check Effect: You may re-roll the triggering Skill Check with a +2 Bonus, taking the new result. This Feature may be used to re-roll a specific roll only once.";
		prereqs.put("Three Skills at Adept Rank or higher", 0);
	}
	public Skill_Monkey(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
            String[] skills = {"Acrobatics", "Athletics", "Charm", "Combat", "Command", "General Education", "Medicine Education", "Occult Education", "Pokemon Education", "Technology Education", "Focus",
            "Guile", "Intimidate", "Intuition", "Perception", "Stealth", "Survival"};
            return checkMultipleSkills(t,skills,4,3);
	}
}