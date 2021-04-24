package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Sword_of_Body_and_Soul extends Feature {
	{
		name = "Sword of Body and Soul";
		tags = "[+Attack or Special Attack]";
		frequency = "2 AP - Swift Action";
		effect = "Trigger: You use a damaging Aura Guardian Move against an adjacent foe Effect: You may have the triggering Move deal damage as if it was your choice of Physical or Special Classes. Regardless, add both your Attack and Special Attack Stats to the Damage Roll, and this attack ignores Damage Reduction. This does not stack with Twisted Power.";
		prereqs.put("Aura Guardian", -1);
		prereqs.put("Intuition", 4);
	}
	public Sword_of_Body_and_Soul(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Aura Guardian") && t.checkSkillRank("Intuition",4);
	}
}