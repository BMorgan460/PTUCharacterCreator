package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Reactive_Armour extends Feature {
	{
		name = "Reactive Armour";
		tags = "[+Defense]";
		frequency = "Scene x2 - Free Action";
		effect = "Trigger: You gain an Injury or take a Critical Hit while wearing metallic Armor Effect: All foes within a Burst 1 lose Hit Points equal to double your Athletics or Focus Rank, and you gain Damage Reduction equal to double your Athletics or Focus Rank for one full round.";
		prereqs.put("Steelheart", -1);
		prereqs.put("Athletics", 4);
		prereqs.put("Focus", 4);
	}
	public Reactive_Armour(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Steelheart") && t.checkSkillRank("Athletics",4) && t.checkSkillRank("Focus",4);
	}
}