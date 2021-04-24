package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Marksman extends Feature {
	{
		name = "Marksman";
		tags = "[Class][+Attack][Weapon]";
		frequency = "Static";
		effect = "You gain the Sniper Ability.";
		prereqs.put("Combat", 3);
		prereqs.put("Perception", 3);
	}
	public Marksman(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Combat",3) && t.checkSkillRank("Perception",3);
	}
}