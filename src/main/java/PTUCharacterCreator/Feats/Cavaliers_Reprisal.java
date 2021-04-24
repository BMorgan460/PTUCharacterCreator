package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Cavaliers_Reprisal extends Feature {
	{
		name = "Cavalier's Reprisal";
		tags = "[+Speed]";
		frequency = "1 AP - Free Action";
		effect = "Trigger: An adjacent foe hits your Mount with an attack Effect: You may make a Struggle Attack against the triggering foe.";
		prereqs.put("Ride as One", -1);
		prereqs.put("Acrobatics", 5);
		prereqs.put("Athletics", 5);
	}
	public Cavaliers_Reprisal(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Ride as One") && t.checkSkillRank("Acrobatics",5) && t.checkSkillRank("Athletics",5);
	}
}