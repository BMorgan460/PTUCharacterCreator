package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Seize_The_Moment extends Feature {
	{
		name = "Seize The Moment";
		tags = "";
		frequency = "Scene x2 - Free Action";
		effect = "Trigger: Your Pokemon would gain Momentum while already at 6 Momentum Effect: Your Pokemon loses 6 Momentum, and then gains +1 Momentum. Your Pokemon may immediately make an attack as an Interrupt, but this attack must target only a Tagged Foe. If the attack misses, it still deals damage as if it had the Smite keyword. If the attack hits, its automatically a Critical Hit. If it would have already been a Critical Hit, your Pokemon gains Hit Points equal to half of its maximum Hit Points. May be used only once per Scene per Pokemon .";
		prereqs.put("Duelist", -1);
		prereqs.put("Focus", 6);
	}
	public Seize_The_Moment(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Duelist") && t.checkSkillRank("Focus",6);
	}
}