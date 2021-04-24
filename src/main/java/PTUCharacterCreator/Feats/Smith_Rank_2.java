package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Smith_Rank_2 extends Feature {
	{
		name = "Smith Rank 2";
		tags = "[Ranked 2][+Attack]";
		frequency = "Static";
		effect = "You may create Fine Weapons for $2,000, Helmets for $1,125, Heavy Shields for $2,250 and Heavy Armor for $5,000.";
		prereqs.put("Focus", 4);
		prereqs.put("Athletics", 4);
	}
	public Smith_Rank_2(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Focus",4) && t.checkSkillRank("Athletics",4);
	}
}