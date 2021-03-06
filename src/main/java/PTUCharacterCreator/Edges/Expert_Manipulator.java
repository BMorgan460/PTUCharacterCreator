package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Expert_Manipulator extends Edge {
	{
		name = "Expert Manipulator";
		effect = "You gain a +2 Opposed Checks with all Manipulate Maneuvers. The Once per Scene per Foe Limitation of each Manipulate Maneuver is expended only upon succesfully affecting a foe with that Manipulate Maneuver.";
		prereqs.put("Guile", 4);
	}
	public Expert_Manipulator(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Guile",4) && true;
	}
}