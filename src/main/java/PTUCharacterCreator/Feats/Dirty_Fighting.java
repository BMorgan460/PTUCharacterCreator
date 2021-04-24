package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Dirty_Fighting extends Feature {
	{
		name = "Dirty Fighting";
		tags = "[+Attack]";
		frequency = "1 AP - Swift Action";
		effect = "Trigger: You hit a foe with Weapon Attack Effect: After the attack is Resolved, you may immediately use the Dirty Trick Maneuver if the target is within range. You automatically hit with Dirty Trick, but must still make an Opposed Roll.";
		prereqs.put("Rogue", -1);
		prereqs.put("a Rogue Skill at Adept Rank", 0);
	}
	public Dirty_Fighting(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
            String[] s = {"Stealth", "Acrobatics", "Athletics"};
		return t.hasFeat("Rogue") && checkMultipleSkills(t,s,4,1);
	}
}