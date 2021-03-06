package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Type_Methodology extends Feature {
	{
		name = "Type Methodology";
		tags = "";
		frequency = "Scene x2 - Free Action";
		effect = "Effects depend on whether your Pokemon has the Tolerance or Exploit ability. ?? Whenever your Pokemon with Tolerance takes Super-Effective damage from a Tagged foe, your Pokemon may lose 2 Momentum to Resist that attack one step. ?? Whenever your Pokemon with Exploit deals Resisted damage to a Tagged foe, your Pokemon may lose 2 Momentum to increase the effectiveness of the attack one step.";
		prereqs.put("Effective Methods", -1);
		prereqs.put("Focus", 4);
	}
	public Type_Methodology(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Effective Methods") && t.checkSkillRank("Focus",4);
	}
}