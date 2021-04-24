package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Bring_It_On_Playtest extends Feature {
	{
		name = "Bring It On! [Playtest]";
		tags = "[9-15 Playtest]";
		frequency = "1 AP - Free Action";
		effect = "Effect: You may trigger Bring It On! whenever...  A Cheered Ally takes Damage, to grant them 5 Damage Reduction agains the triggering Damage.  A Cheered Ally makes a Save Check, to grant them  a +2 Bonus on that check.  A Cheered Ally Takes a Breather, to grant them Temporary Hit Points equal to your Charm Rank. A target may benefit from each Bring It On! effect only once per Scene.";
		prereqs.put("Cheers [Playtest]", -1);
		prereqs.put("Charm", 4);
	}
	public Bring_It_On_Playtest(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Cheers [Playtest]") && t.checkSkillRank("Charm",4);
	}
}