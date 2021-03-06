package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Clever_Ruse extends Feature {
	{
		name = "Clever Ruse";
		tags = "";
		frequency = "At-Will - Free Action";
		effect = "Trigger: Your Pokemon misses all targets with a Dark-Type attack on their turn Effect: Your Pokemon may apply two of the effects below after the triggering attack is resolved. Your Pokemon may also take a Standard Action to trigger this Feature. This Feature may be triggered only once per round. ?? They gain +4 Evasion for one full round. ?? Their attacks ignore Evasion from Stats until the end of their next turn. ?? They may immediately Disengage as a Free Action.";
		prereqs.put("Type Ace", -1);
		prereqs.put("Dark as Chosen Type", 0);
	}
	public Clever_Ruse(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Type Ace");
	}
}