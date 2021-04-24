package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Glitch_Shuffle extends Feature {
	{
		name = "Glitch Shuffle";
		tags = "[+Special Defense]";
		frequency = "Static";
		effect = "You learn the Moves Metronome and Topsy-Turvy";
		prereqs.put("Glitch Bender", -1);
		prereqs.put("Perception", 5);
	}
	public Glitch_Shuffle(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Glitch Bender") && t.checkSkillRank("Perception",5);
	}
}