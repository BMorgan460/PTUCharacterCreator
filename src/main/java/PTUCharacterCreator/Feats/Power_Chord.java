package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Power_Chord extends Feature {
	{
		name = "Power Chord";
		tags = "";
		frequency = "Scene x2 - Free Action";
		effect = "Trigger: You play a Song Effect: Make a Charm or Focus Check, and add your Special Attack. Foes in the area of effect take Special Normal-Type Damage equal to the result.";
		prereqs.put("Noise Complaint", -1);
		prereqs.put("Charm", 6);
		prereqs.put("Focus", 6);
	}
	public Power_Chord(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Noise Complaint") && t.checkSkillRank("Charm",6) && t.checkSkillRank("Focus",6);
	}
}