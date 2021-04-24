package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Defender extends Feature {
	{
		name = "Defender";
		tags = "[+HP]";
		frequency = "Static";
		effect = "Using the Intercept Maneuvers requires only a Shift Action Interrupt.";
		prereqs.put("Athletics", 4);
	}
	public Defender(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Athletics",4);
	}
}