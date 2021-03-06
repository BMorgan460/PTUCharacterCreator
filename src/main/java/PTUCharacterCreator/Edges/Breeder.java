package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Breeder extends Edge {
	{
		name = "Breeder";
		effect = "If you are able to give two Pokemon that are compatible for breeding at least 4 hours of time alone, you may make a Pokemon Education Check with a DC of 12. If you succeed, the Pokemon are guaranteed to produce an egg if you give them an additional 4 hours.";
		prereqs.put("Poke Edu", 3);
	}
	public Breeder(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Poke Edu",3) && true;
	}
}