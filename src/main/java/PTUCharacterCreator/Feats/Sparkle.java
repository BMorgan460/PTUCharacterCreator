package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Sparkle extends Feature {
	{
		name = "Sparkle";
		tags = "[+Special Attack]";
		frequency = "Static";
		effect = "You learn the Moves Tri-Attack and Weather Ball.";
		prereqs.put("Prism", -1);
		prereqs.put("Charm", 5);
		prereqs.put("Gen Edu", 5);
	}
	public Sparkle(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Prism") && t.checkSkillRank("Charm",5) && t.checkSkillRank("Gen Edu",5);
	}
}