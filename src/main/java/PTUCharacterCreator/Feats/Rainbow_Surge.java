package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Rainbow_Surge extends Feature {
	{
		name = "Rainbow Surge";
		tags = "[+Special Attack]";
		frequency = "Static";
		effect = "You learn the Moves Hyper Beam and Morning Sun.";
		prereqs.put("Sparkle", -1);
		prereqs.put("Charm", 6);
		prereqs.put("Gen Edu", 6);
	}
	public Rainbow_Surge(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Sparkle") && t.checkSkillRank("Charm",6) && t.checkSkillRank("Gen Edu",6);
	}
}