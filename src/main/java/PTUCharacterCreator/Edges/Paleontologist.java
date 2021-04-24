package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Paleontologist extends Edge {
	{
		name = "Paleontologist";
		effect = "You can identify fossils with a DC 10 Pokemon Education or Survival Check. You know how to operate Reanimation Machines and can use them to revive Fossils. See the Pokemon Fossils section (page 216) for more information.";
		prereqs.put("Poke Edu or Survival", 3);
	}
	public Paleontologist(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Poke Edu",3) || t.checkSkillRank("Survival",3);
	}
}