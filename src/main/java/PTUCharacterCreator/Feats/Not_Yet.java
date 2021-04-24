package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Not_Yet extends Feature {
	{
		name = "Not Yet!";
		tags = "";
		frequency = "Scene - Free Action";
		effect = "Trigger: Your Pokemon is Fainted, but is not at less than -100% Hit Points Effect: Before fainting, the targeted Pokemon gains an Injury, and may then use a Move as an Interrupt. When the Move is resolved, the Pokemon then immediately faints. This consumes a Command as normal. This cannot be used with the Move Explosion, Flail, Pain Split, Reversal or Selfdestruct.";
		prereqs.put("Enduring Soul", -1);
		prereqs.put("Athletics", 5);
		prereqs.put("Focus", 5);
	}
	public Not_Yet(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Enduring Soul") && t.checkSkillRank("Athletics",5) && t.checkSkillRank("Focus",5);
	}
}