package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Adrenaline_Rush extends Feature {
	{
		name = "Adrenaline Rush";
		tags = "[+HP]";
		frequency = "Daily x3 - Free Action";
		effect = "Trigger: You are lowered to half or your Maximum Hit Points or less Effect: You gain +1 Combat Stage in each of your Trained Stats, are cured of up to two Status Afflictions, and gain a Tick of Temporary Hit Points. Adrenaline Rush may be used only once per Scene";
		prereqs.put("Athlete", -1);
		prereqs.put("Athletics", 5);
	}
	public Adrenaline_Rush(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Athlete") && t.checkSkillRank("Athletics",5);
	}
}