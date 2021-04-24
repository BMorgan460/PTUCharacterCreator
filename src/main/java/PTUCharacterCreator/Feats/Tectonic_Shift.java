package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Tectonic_Shift extends Feature {
	{
		name = "Tectonic Shift";
		tags = "[+Defense]";
		frequency = "Static";
		effect = "Pick two of Earthquake, Earth Power, or Sand Tomb. You learn the chosen Moves";
		prereqs.put("Ground Out", -1);
		prereqs.put("Focus", 6);
		prereqs.put("Intuition", 6);
	}
	public Tectonic_Shift(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Ground Out") && t.checkSkillRank("Focus",6) && t.checkSkillRank("Intuition",6);
	}
}