package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Go_Fight_Win_Playtest extends Feature {
	{
		name = "Go, Fight, Win! [Playtest]";
		tags = "[Orders] [9-15 Playtest]";
		frequency = "Scene x3 - Standard Action";
		effect = "Effect: Choose and perform one of the cheers below. You may perform each Cheer only once per Scene. ?? Show Your Best!: Choose Def or Sp.Def, all allies on the Field gain +1 CS in the chosen Stat.  Dont Stop Now!: All allies on the Field gain Temporary Hit Points equal to your Charm Rank. ?? I Believe In You!: All allies on the Field gain a +2 Bonus to evasion for 1 full round.";
		prereqs.put("Moment of Action [Playtest]", -1);
		prereqs.put("Charm", 5);
	}
	public Go_Fight_Win_Playtest(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Moment of Action [Playtest]") && t.checkSkillRank("Charm",5);
	}
}