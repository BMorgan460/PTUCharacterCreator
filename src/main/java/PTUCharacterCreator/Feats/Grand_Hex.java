package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Grand_Hex extends Feature {
	{
		name = "Grand Hex";
		tags = "[+HP]";
		frequency = "1 AP - Swift Action";
		effect = "Trigger: You hit a foe with Hex Effect: Regain one use of a Move gained from Hex Maniac Studies that can inflict a Status Affliction that the triggering target has. If you activated the conditional damage boost for Hex, its Frequency is not expended. You may only activate Grand Hex once per target per Scene.";
		prereqs.put("Hex Maniac Studies Rank 3", -1);
		prereqs.put("Ocu Edu", 6);
	}
	public Grand_Hex(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Hex Maniac Studies Rank 3") && t.checkSkillRank("Ocu Edu",6);
	}
}