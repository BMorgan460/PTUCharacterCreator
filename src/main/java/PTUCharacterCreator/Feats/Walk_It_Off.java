package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Walk_It_Off extends Feature {
	{
		name = "Walk It Off";
		tags = "[+HP]";
		frequency = "Daily - Extended Action";
		effect = "Remove one Injury from yourself and regain 1/4th of your maximum Hit Points. This Injury removal doesnt count against the natural healing limit on Injuries each day.";
		prereqs.put("Athletics", 4);
		prereqs.put("Focus", 3);
	}
	public Walk_It_Off(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Athletics",4) && t.checkSkillRank("Focus",3);
	}
}