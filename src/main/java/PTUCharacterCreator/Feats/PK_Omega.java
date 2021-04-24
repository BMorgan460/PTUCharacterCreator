package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class PK_Omega extends Feature {
	{
		name = "PK Omega";
		tags = "[+Special Attack]";
		frequency = "Static";
		effect = "You learn the Moves Telekinesis and Psychic.";
		prereqs.put("PK Alpha", -1);
		prereqs.put("Focus", 5);
	}
	public PK_Omega(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("PK Alpha") && t.checkSkillRank("Focus",5);
	}
}