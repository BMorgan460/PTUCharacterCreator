package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Go_Fight_Win extends Feature {
	{
		name = "Go, Fight, Win!";
		tags = "[Orders]";
		frequency = "At-Will - Standard Action + Swift Action";
		effect = "Choose and perform one of the cheers below. You may perform each Cheer only once per Scene. ?? Show Your Best!: Choose Defense or Special Defense. All allies on the field gain +1 Combat Stage in the Chosen Stat and become Motivated.  ?? Dont Stop Now!: All allies on the field gain Temporary Hit Points equal to your Charm Rank and become Excited.  ?? I Believe In You!: All allies on the field gain a +2 bonus to Evasion for one full Round, and become Cheered.";
		prereqs.put("Moment of Action", -1);
		prereqs.put("Charm", 5);
	}
	public Go_Fight_Win(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Moment of Action") && t.checkSkillRank("Charm",5);
	}
}