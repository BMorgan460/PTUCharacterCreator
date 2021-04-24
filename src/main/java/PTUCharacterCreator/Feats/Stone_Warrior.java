package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Stone_Warrior extends Feature {
	{
		name = "Stone Warrior";
		tags = "[Class] [+Defense]";
		frequency = "Static";
		effect = "You learn the Moves Rock Tomb and Wide Guard.";
		prereqs.put("Elemental Connection (Rock)", 0);
		prereqs.put("Combat", 3);
		prereqs.put("Survival", 3);
	}
	public Stone_Warrior(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Combat",3) && t.checkSkillRank("Survival",3);
	}
}