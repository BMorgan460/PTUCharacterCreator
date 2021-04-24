package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Defensive_Hacking extends Edge {
	{
		name = "Defensive Hacking";
		effect = "You may add your Focus Ranks as additional Damage Reduction while in digital battles. You may apply this Damage Reduction to Technology Education attacks.";
		prereqs.put("Tech Edu", 4);
		prereqs.put("Focus", 3);
		prereqs.put(" Datajack Augmentation", 0);
	}
	public Defensive_Hacking(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Tech Edu",4) && t.checkSkillRank("Focus",3) && true;
	}
}