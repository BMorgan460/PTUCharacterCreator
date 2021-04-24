package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Devious extends Feature {
	{
		name = "Devious";
		tags = "";
		frequency = "Scene x2 - Free Action";
		effect = "Trigger: Your Dark-Type Pokemon uses a Move with the Social keyword. Effect: Your Pokemon may immediately use a naturally Dark-Typed Status-Class Move or a Move with the Social keyword as a Free Action. This must be a different Move than the triggering Move, and must follow all Frequency limitations. Devious may be used only once per Scene per Pokemon.";
		prereqs.put("Clever Ruse", -1);
		prereqs.put("Type-Linked Skill at Expert", 0);
	}
	public Devious(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Clever Ruse");
	}
}