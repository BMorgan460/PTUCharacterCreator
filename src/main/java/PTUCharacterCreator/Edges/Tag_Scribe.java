package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Tag_Scribe extends Edge {
	{
		name = "Tag Scribe";
		effect = "You create a Cleanse Tag. This may be used a number of times each day equal to half your Occult Education Rank.";
		prereqs.put("Ocu Edu", 3);
	}
	public Tag_Scribe(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Ocu Edu",3) && true;
	}
}