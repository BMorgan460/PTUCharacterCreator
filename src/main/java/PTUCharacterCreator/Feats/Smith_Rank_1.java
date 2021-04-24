package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Smith_Rank_1 extends Feature {
	{
		name = "Smith Rank 1";
		tags = "[Ranked 2][+Attack]";
		frequency = "Static";
		effect = "You may create Simple Weapons for $1000, Light Shields for $1,500, and Light Armor for $4,000.";
		prereqs.put("Focus", 3);
		prereqs.put("Athletics", 3);
	}
	public Smith_Rank_1(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Focus",3) && t.checkSkillRank("Athletics",3);
	}
}