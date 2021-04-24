package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Expert_Trickster extends Edge {
	{
		name = "Expert Trickster";
		effect = "You gain a +2 Opposed Checks with all Dirty Trick Maneuvers. The Once per Scene per Foe Limitation of each Dirty Trick Maneuver is expended only upon successfully affecting a foe with that Dirty Trick Maneuver.";
		prereqs.put("Stealth", 4);
	}
	public Expert_Trickster(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Stealth",4) && true;
	}
}