package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Groomer extends Edge {
	{
		name = "Groomer";
		effect = "You know how to effectively groom your Pokemon with access to a Groomer’s Kit. You may groom up to 6 Pokemon in one hour. Grooming Pokemon may count as an hour of Training, and you may apply Experience Training, teach Poke-Edges, and apply any Features that could be applied during Training. If you apply Experience Training from Grooming, use your General Education or Pokemon Education Rank to determine Bonus Experience gained during Training. A Pokemon that has been Groomed also gains a +1d6 Bonus to the Introduction Roll of a Contest for the rest of the day.";
		prereqs.put("Poke Edu", 3);
	}
	public Groomer(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Poke Edu",3) && true;
	}
}