package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class New_Normal extends Feature {
	{
		name = "New Normal";
		tags = "";
		frequency = "Scene x2 - Free Action";
		effect = "Trigger: Your Pokemon hits with a Normal-Type Move with conditional modifiers which increase or decrease its damage Effect: You use the highest damage value for the triggering Move. New Normal may only be used once per Scene per Pokemon. New Normal may not raise a Moves Damage Base above 14, if a Move would have its Damage Base raised above that value, it is instead raised to 14. (Examples: Return is DB 9, Wring Out never has its damage decreased due to the targets Hit Points, Retaliate is DB 14.)";
		prereqs.put("Extra Ordinary", -1);
		prereqs.put("Type-Linked Skill at Expert", 0);
	}
	public New_Normal(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Extra Ordinary");
	}
}