package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class The_Power_of_Aura_Rank_1 extends Feature {
	{
		name = "The Power of Aura Rank 1";
		tags = "[+Attack or Special Attack] [Ranked 2]";
		frequency = "Static";
		effect = "Choose Scrappy or Aura Storm. You gain the Chosen Ability.";
		prereqs.put("Aura Guardian", -1);
	}
	public The_Power_of_Aura_Rank_1(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Aura Guardian");
	}
}