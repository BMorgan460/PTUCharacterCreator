package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Focused_Command extends Feature {
	{
		name = "Focused Command";
		tags = "[Orders]";
		frequency = "At-Will - Standard Action + Swift Action";
		effect = "You may have a second Pokemon take a turn this round, but both Pokemon can only take At-Will actions that round. Additionally, both Pokemon receive a -5 Penalty on all Damage Rolls. You may pay 1 AP at the beginning of the round to lift the Frequency Restriction OR the Damage Penalty for the remainder of the round, or pay 2 AP to lift both.";
		prereqs.put("Command", 6);
		prereqs.put("Poke Edu", 5);
	}
	public Focused_Command(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Command",6) && t.checkSkillRank("Poke Edu",5);
	}
}