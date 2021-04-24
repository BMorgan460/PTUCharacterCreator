package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Wind_Runner extends Feature {
	{
		name = "Wind Runner";
		tags = "[Class][+Speed]";
		frequency = "Static";
		effect = "You gain the Levitate Ability. You have a total Levitate Speed equal to 4 plus half of the higher of your Acrobatics or Perception Rank.";
		prereqs.put("Elemental Connection (Flying)", 0);
		prereqs.put("Acrobatics", 3);
		prereqs.put("Perception", 3);
	}
	public Wind_Runner(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Acrobatics",3) && t.checkSkillRank("Perception",3);
	}
}